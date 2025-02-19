import java.util.*;

class Complex{
    int real, imaginary;
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void add(Complex C1, Complex C2){
        this.real = C1.real + C2.imaginary;
        this.imaginary = C1.imaginary + C2.imaginary;
        System.out.println("The addition is : " + this.real + "+" + this.imaginary + "i");
    }
    void sub(Complex C1, Complex C2){
        this.real = C1.real - C2.imaginary;
        this.imaginary = C1.imaginary - C2.imaginary;
        System.out.println("The subtraction is : " + this.real + "+" + this.imaginary + "i");
    }
    void mul(Complex C1, Complex C2){
        this.real = C1.real * C2.imaginary;
        this.imaginary = C1.imaginary * C2.imaginary;
        System.out.println("The multiplication is : " + this.real + "+" + this.imaginary + "i");
    }
}
class complexOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st real part");
        int a = sc.nextInt();
        System.out.println("Enter the 1st imaginary part");
        int b = sc.nextInt();
        System.out.println("Enter the 2nd real part");
        int c = sc.nextInt();
        System.out.println("Enter the 2nd imaginary part");
        int d = sc.nextInt();
        Complex C1 = new Complex(a, b);
        Complex C2 = new Complex(c, d);
        sc.close();
        // Complex.sub(C1,C2);
        C2 = C1; //comment out when running program
        C1 = C2;
    }
}
