import java.util.*;
public class stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int totalLength = 0;
        System.out.println("Enter the Array elements");
        String array[] = new String[size];
        
        for(int i = 0; i < size; i++){
            array[i] = sc.next();
            
            // Note
            totalLength += array[i].length();
        }
        System.out.println(totalLength);
        sc.close();
    }
}