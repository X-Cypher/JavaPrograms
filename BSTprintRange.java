public class BSTprintRange {
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
    public static void printRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
            return;
        }
        if(root.data < k1){
            printRange(root.right, k1, k2);
        }
        if(root.data > k2){
            printRange(root.left, k1, k2);
        }
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        printRange(root, 3, 7);
    }
}
