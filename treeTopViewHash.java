import java.util.*;
import java.util.LinkedList;
public class treeTopViewHash {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
        static int index = -1;
        public Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){ //if value of node = -1 then it means null              1
                return null;                        //                                     / \
            }                                       //                                    2   3  
            Node newNode = new Node(nodes[index]); //                                    / \   \ 
            //pehle left mai add krte hai                                               4   5   6
            newNode.left = buildTree(nodes);//                                                   \
            newNode.right = buildTree(nodes);//                                                   7
            return newNode;
        }
        public class Info{
            Node data;
            int hd; //horizontal dist. from root node
            public Info(Node data, int hd){
                this.data = data;
                this.hd = hd;
            }
        }
        public void topView(Node root){
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0, max = 0;
            //level order traversal
            q.add(new Info(root, 0));
            q.add(null);

            while(!q.isEmpty()){
                Info curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else{
                    if(!map.containsKey(curr.hd)){ //hd is occuring first time
                        map.put(curr.hd, curr.data);
                    }
                    if(curr.data.left != null){
                        q.add(new Info(curr.data.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if(curr.data.right != null){
                        q.add(new Info(curr.data.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }
                    for(int i = min; i <= max; i++){
                        System.out.print(map.get(i).data+" ");
                    }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        tree.topView(root);
    }
}