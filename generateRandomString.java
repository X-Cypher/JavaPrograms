import java.util.Random;

public class generateRandomString {
    public static void main(String[] args) {
        String AlphaNumericStr = null;
        AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int RInt = random.nextInt(AlphaNumericStr.length());
            if (RInt == 0) RInt++;    
            char ch = AlphaNumericStr.charAt(RInt - 1);    
            s.append(ch);
        }
        System.out.println(s.toString());
    }
}
