public class wordBreak {
    class Node{
        Node children[] = new Node[26];
        boolean end = false;
        Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();
    public static insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
    }
}
