import java.util.Scanner;

// Count how many times lower case vowels occurred in a String entered by the user
public class stringsQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int count = 0;
        String abc = "aeiou";
        for(int i = 0; i < s.length(); i++){
            // if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
            //     count++;
            // }
            char ch = s.charAt(i);
            if(abc.indexOf(ch) != -1){
                count++;
            }
        }
        System.out.println("The number of lowercase vowels is: " + count);
        sc.close();
    }
}
