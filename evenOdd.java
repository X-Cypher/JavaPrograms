public class evenOdd {
    public static void main(String[] args) {
        
    }

    public static void printEven(int n){
        if(n == 0){
            return;
        }
        System.out.println(n * 2);
        printEven(n-1);
    }

    public static void printOdd(int n){
        if(n == 0){
            return;
        }
        System.out.println(n * 2 - 1);
        printOdd(n-1);
    }
    
}
