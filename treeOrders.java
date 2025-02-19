import java.util.*;
import java.util.LinkedList;
public class treeOrders {
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
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        //root > left node > right node
        public void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        //left node > root > right node
        public void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        //left node > right node > root
        public void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        //print level-wise
        public void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            //logic : whenever we encounter null in Queue, next line
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    //if currentNode == null && q.isEmpty. break 
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }    
            }
        }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        // tree.preOrder(root);
        // tree.inOrder(root);
        // tree.postOrder(root);
        tree.levelOrder(root);
        }
    }
}
