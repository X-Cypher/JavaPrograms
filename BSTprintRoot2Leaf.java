import java.util.*;
public class BSTprintRoot2Leaf {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            return root = new Node(val);
        }
        if(root.data > val){ //left subTree
            root.left = insert(root.left, val);
        } else{              //right subTree
          root.right = insert(root.right, val);
        }
        return root;
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i <= path.size() - 1; i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void root2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        root2Leaf(root.left, path);
        root2Leaf(root.right, path);
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        root2Leaf(root, new ArrayList<>());;
    }
}
