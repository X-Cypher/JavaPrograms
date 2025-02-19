import java.util.*;
import java.util.LinkedList;
public class nonRepeatingCharacter {
    public static void nonRepeating(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++; //index
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){ //if an element appears more than once, remove it.
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1);
            } else{
                System.out.println(q.peek());
            }
        }
    }
    public static void main(String[] args) {
        String s = "aabccxb";
        nonRepeating(s);
    }
}
