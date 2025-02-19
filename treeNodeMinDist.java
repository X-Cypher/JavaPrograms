public class treeNodeMinDist {
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
        // lca = lowest common ancestor
        public Node lca(Node root, int n1, int n2){ //O(n)
            if(root == null || root.data == n1 || root.data == n2){//if any given node = root, then root is the lca
                return root;
            }
            Node leftLca = lca(root.left, n1, n2);
            Node rightLca = lca(root.right, n1, n2);
            if(leftLca == null){ //if there is no left common ancestor then it means both nodes are in right
                return rightLca;// and vice versa
            }
            if(rightLca == null){
                return leftLca;
            }
            // if both values are != null, then root is the common ancestor
            return root;
        }
        public int minDist(Node root, int n1, int n2){
            Node lca = lca(root, n1, n2);
            int d1 = lcaDist(lca, n1);
            int d2 = lcaDist(lca, n2);
            return d1 + d2;
        }
        public int lcaDist(Node lca, int n){
            if(lca == null){
                return -1;
            }
            if(lca.data == n){//lca and node are same so dist = 0
                return 0;
            }
            int leftDist = lcaDist(lca.left, n);//left dist of node from lca
            int rightDist = lcaDist(lca.right, n);//right dist of node from lca

            if(leftDist == -1 && rightDist == -1){
                return -1;
            } else if(leftDist == -1){
                return rightDist + 1;
            } else{
                return leftDist + 1;
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.minDist(root, 2, 6));
    }
}