public class BSTsearch {
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
    public static boolean search(Node root, int key){//O(H) h: height of tree
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        if(search(root, 2)){
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }
    }
}

