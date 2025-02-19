import java.util.*;
public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its divisors");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if((n % i) == 0){
                al.add(i);
                if((n/i) != i){ //for n = 36, ex: 2 & 18
                    al.add(n/i);
                }
            }
        }
        Collections.sort(al);
        System.out.println(al);
        sc.close();
    }
}
