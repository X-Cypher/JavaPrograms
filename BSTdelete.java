public class BSTdelete {
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
    public static Node delete(Node root, int node){
        if(root.data > node){ //node is in left
            root.left = delete(root.left, node); 
        } else if(root.data < node){ // node is in right
            root.right = delete(root.right, node);
        } else{ // root == node
            // Case 1: Leaf node
            if(root.left == null && root.right == null){
                return null;
            } 
            // Case 2: single child
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            // Case 3: 2 child
            //find in right because right always has bigger values
            Node succ = inOrderSuccessor(root.right);//find successor of the root
            root.data = succ.data; // replace root value with succ value
            root.right = delete(root.right, succ.data);// delete succ
        }
        return root;
    }
    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        delete(root, 4);
        inOrder(root);//in BST inorder always give sorted output(ascending)
    }
}