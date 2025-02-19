import java.util.Scanner;

public class javac {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Excel column label:");
            String columnLabel = scanner.nextLine().toUpperCase();

            int columnNumber = 0;
            for (int i = 0; i < columnLabel.length(); i++) {
                columnNumber = columnNumber * 26 + (columnLabel.charAt(i) - 'A' + 1);
            }

            System.out.println("Column Number: " + columnNumber);
        }
    }      
    
