import java.util.*;
import java.util.LinkedList;
public class kthLevelTree {
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
            newNode.left = buildTree(nodes);       //                                            \
            newNode.right = buildTree(nodes);//                                                   7
            return newNode;
        }
        //iterative approach/loop approach 
        //self written
        static int count = 1;
        public void kLevel(Node root, int k){ //O(n)
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                if(count == k){
                    while(q.peek() != null){
                        System.out.print(q.peek().data+" ");
                        q.remove();
                    }
                }
                Node curr = q.remove();
                if(curr == null){
                    count++; //increase count because null means next level
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else{
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
        //approach 2: recursion
        public void klevel1(Node root, int level, int k){
            if(root == null){
                return;
            }
             if(level == k){
                System.out.print(root.data+" ");
                return;
             }
             klevel1(root.left, level + 1, k);
             klevel1(root.right, level + 1, k);
        }
    }
        public static void main(String[] args) {
            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
            binaryTree tree = new binaryTree();
            Node root = tree.buildTree(nodes);
            tree.kLevel(root, 0);
            tree.klevel1(root,1, 3);
    }
}