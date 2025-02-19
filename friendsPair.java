public class friendsPair {
    public static int pair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return pair(n-1) + (n-1)*pair(n-2); //n-1 ways of choosing his partner
                                            // {a,b,c,d,e} = (a,b)*f(n-2) + (a,c)*f(n-2)..... = (n-1)*f(n-2)
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
