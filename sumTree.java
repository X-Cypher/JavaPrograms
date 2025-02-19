public class sumTree {
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
        public int sumTree(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumTree(root.left);
            int rightSum = sumTree(root.right);

            int data = root.data; //store this because we have to return original value of node for calculation
            int a = root.left == null ? 0:root.left.data; // a and b are declared to handle null pointer exception
            int b = root.right == null ? 0:root.right.data;// if null, then value = 0, else original data
            root.data = a + b + leftSum + rightSum; //new value of node
            return data;
        }
        public void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        tree.sumTree(root);
        tree.preOrder(root);
    }
}