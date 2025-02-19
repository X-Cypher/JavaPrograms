public class BSTmirror {
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
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node rightMirror = mirror(root.right);
        Node leftMirror = mirror(root.left);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        mirror(root);
        inOrder(root);
    }
}
