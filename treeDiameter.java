//diameter = no. of nodes in longest path b/w two leaves
public class treeDiameter {
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
        public int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }
        //approach 1
        public int diameter(Node root){ //O(n^2) because height calculation takes O(n)
            if(root == null){           //height of n nodes is calculated so O(n*n)
                return 0;
            }
            int ld = diameter(root.left);
            int lh = height(root.left);
            int rd = diameter(root.right);
            int rh = height(root.right);
            int selfd = lh + rh + 1; //diameter including root
            return Math.max(selfd, Math.max(rd, ld));//diameter = max. of : left diameter, right diameter, root diameter
        }
        public class Info{
            int diam;
            int ht;
            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }
        //approach 2
        public Info diameter1(Node root){ //O(n)
            if(root == null){
                return new Info(0, 0);
            }
            Info leftInfo = diameter1(root.left);
            Info rightInfo = diameter1(root.right);
            int diam = Math.max(leftInfo.ht + rightInfo.ht + 1, Math.max(leftInfo.diam, rightInfo.diam));
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
            return new Info(diam, ht);
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("The diameter of tree : " + tree.diameter1(root).diam);
    }
}