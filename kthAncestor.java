public class kthAncestor {
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
        public int kthAncestor(Node root, int n, int k){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }
            int leftD = kthAncestor(root.left, n, k);
            int rightD = kthAncestor(root.right, n, k);
            int x;
            if(leftD == -1 && rightD == -1){
                return -1;
            } else if(leftD == -1){
                x = rightD;
            } else{
                x = leftD;
            }
            if(x+1 == k){
                System.out.println(root.data);
            }
            return x+1;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        tree.kthAncestor(root, 6, 2);
    }
}