public class subTree {
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
        public boolean isIdentical(Node root, Node subTree){
            if(root == null && subTree == null){ //if both are null, we have reached the bottom
                return true; //base case
            } else if(root == null || subTree == null || root.data != subTree.data){
                return false;
            }
            //we have to check if left and right sub nodes are identical or not
            if(!isIdentical(root.left, subTree.left)){
                return false;
            }
            if(!isIdentical(root.right, subTree.right)){
                return false;
            }
            return true;
        }
        public boolean isSubTree(Node root, Node subTree){
            if(root == null){
                return false;
            }
            //first match root data, then check subroots
            if(root.data == subTree.data){
                if(isIdentical(root, subTree)){
                    return true;
                }
            }
            return isSubTree(root.left, subTree) || isSubTree(root.right, subTree); //if either returns true
            //it means that sub root is found in the left or right part
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(5);
        System.out.println(tree.isSubTree(root, subTree));
    }
}    
