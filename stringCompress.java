import java.util.Scanner;

public class stringCompress {
    public static StringBuilder compress(String s){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i < s.length(); i++){
            Integer count = 1;      //we have used Integer in place of int because we have to add this number to string and
            while(s.charAt(i) == s.charAt(i+1) && i<s.length()-1){ //for that we need Integer type
                count++;
                i++;
            }                       
            sb.append(s.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println(compress(s));
        sc.close();
    }
}
