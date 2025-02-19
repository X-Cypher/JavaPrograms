// Determine if 2 Strings are anagrams of each other.
//If two strings contain the same characters but in a different order,they can be said to be Anagrams. Eg. race & care
import java.util.Scanner;
import java.util.Arrays;
public class stringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.nextLine();
        System.out.println("Enter second String");
        String s2 = sc.nextLine();
        //***Logic***
        // if sorted arrays are equal, then the strings are anagram.
        char ch1 [] = s1.toCharArray(); //converting strings to array
        char ch2 [] = s2.toCharArray();
        Arrays.sort(ch1); //sorting the arrays in ascending order
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            System.out.println("The two strings are Anagrams of each other");
        } else{
            System.out.println("The two strings are not Anagrams of each other");
        }
        sc.close();
    }
}
