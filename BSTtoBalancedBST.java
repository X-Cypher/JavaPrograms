import java.util.ArrayList;

public class BSTtoBalancedBST {
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
    public static void inOrderArrayList(ArrayList<Integer> list, Node root){
        if(root == null){
            return;
        }
        inOrderArrayList(list, root.left);
        list.add(root.data);
        inOrderArrayList(list, root.right);
    }
    public static Node createBST(ArrayList<Integer> list, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, start, mid-1);
        root.right = createBST(list, mid+1, end);
        return root;
    }
    public static Node balancedBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        inOrderArrayList(inorder, root);//created an inorder arraylist
        //now we know how to make balanced bst using inorder sequence
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBST(root);
        preOrder(root);
    }
}
