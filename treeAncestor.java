public class treeAncestor {
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
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.lca(root, 7, 3).data);
    }
}