import java.util.Stack;

public class duplicateParanthesisStack {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            if(str.charAt(i) == ')'){ //closing case
                while(s.peek() != '(' && !s.isEmpty()){ //runs until we encounter '('
                    s.pop();
                    count++;
                }
                if(count <1){ //duplicate found
                    return true;
                } else{
                    s.pop();
                }
            } else{
                s.push(str.charAt(i)); //opening case
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a-b))";
        if(isDuplicate(str)){
            System.out.println("Duplicate");
        } else{
            System.out.println("Not Duplicate");
        }
    }
}
