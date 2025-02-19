public class NcR {
    public static int ncr(int n, int r){
        int num = 1;
        int den = 1;
        for(int i = 0; i < r; i++){
            num *= (n-i);
            den *= (r-i);
        }
        return num/den;
    }
    public static void main(String[] args) {
        System.out.println(ncr(7, 2));
    }
}
