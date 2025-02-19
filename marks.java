import java.util.*;
public class marks {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i;
    do {
        System.out.println("Enter the student's marks");
        int marks = sc.nextInt();
        if (marks >=90 && marks < 100) {
            System.out.println("This is good");
        }
        else if (marks >= 60 && marks <= 89){
            System.out.println("This is also good");
        }
        else if (marks >= 0 && marks <= 59){
            System.out.println("This is good as well");
        }
        else {
            System.out.println("Invalid input");
        }
        System.out.println("For continuing press 1 else 0");
        i = sc.nextInt();
         } while (i==1);
         sc.close();
         
     }   
}
