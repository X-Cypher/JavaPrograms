// program to input a string and replace 'e' with 'i'

import java.util.*;
public class stringreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next();
        String result = "";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += input.charAt(i);
            }
        }
        sc.close();
        System.out.println("The modified string is :" + result);
    }
    
}
