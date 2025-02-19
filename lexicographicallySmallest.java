public class lexicographicallySmallest {
    public static void main(String[] args) {
        int n = 5, k = 42;
        char str[] = new char[n];
        //initializing each letter by 'a'
        for(int i = 0; i < str.length; i++){
            str[i] = 'a';
        }
        int x = k - n;
        for(int i = n-1; i >= 0; i--){
            if(x > 26){
                str[i] = 'z';
                x = x-26+1;
            } else if(x > 0){ 
                str[i] = (char)('a' + x);
                x = 0;
            } 
            if(x == 0){
                break;
            }
        }
        System.out.print("The lexicographically smallest string of length "+ n + " is : ");
        System.out.println(str);
    }
}
