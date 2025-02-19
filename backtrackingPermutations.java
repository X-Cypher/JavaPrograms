import java.util.*;

public class backtrackingPermutations {
    // public static void Permutations(String s, String ans){
    //     if(s.length() == 0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     for(int i=0; i<=s.length()-1; i++){
    //         // remove current character from s 
    //         // "abcde" = "ab" + "de" (to remove 'c')
    //         String str = s.substring(0, i) + s.substring(i+1); //remove i from string
    //         Permutations(str, ans + s.charAt(i)); //add i to answer
    //         // Dry run the code for understanding
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to find its permutations");
        String s = sc.next();
        // Permutations(s, "");
        permute(new StringBuilder(s), new StringBuilder());
        sc.close();
    }

    public static void permute(StringBuilder s, StringBuilder ans){
        if(s.length() == 0){
            System.out.println(ans.toString());
            return;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            s.deleteCharAt(i);
            ans.append(ch);
            
            permute(s, ans);
            
            s.insert(i, ch);
            ans.deleteCharAt(ans.length() - 1);
        }
    }
}
