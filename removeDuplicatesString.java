// works for a-z, use HashMap for more advanced 
public class removeDuplicatesString {
    public static void removeDuplicates(int index, String s, StringBuilder str, boolean map[]){
        if(index == s.length()){
            System.out.println(str);
            return;
        }
        if(map[s.charAt(index) - 'a'] == true){
            // duplicate
            removeDuplicates(index + 1, s, str, map);
        } else{ //add true to map[value] and add the word to new string
            map[s.charAt(index) - 'a'] = true; //s.charAt(index) - 'a' = 0 for a; 1 for b; 2 for c...etc
            removeDuplicates(index + 1, s, str.append(s.charAt(index)), map);
        }
    }
    public static void main(String[] args) {
        String s = "duuuplllicatess";
        StringBuilder str = new StringBuilder("");
        boolean map[] = new boolean[26];
        removeDuplicates(0, s, str, map);
    }
}
