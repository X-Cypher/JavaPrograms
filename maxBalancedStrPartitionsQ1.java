// Given a balanced string str with an equal number of L and R, the task is to find a maximum number X,
//  such that a given string can be partitioned into X balanced substrings. 
//  A string called to be balanced if the number of ‘L’s in the string equals the number of ‘R’s. 
public class maxBalancedStrPartitionsQ1 {
    public static void main(String[] args) {
        int l = 0, r = 0;
        String str = "LRRRRLLRLLRL";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'R'){
                r++;
            } else{
                l++;
            }
            if(l == r){
                count++;
                l = 0; r = 0;
            }
        }
        System.out.println("The string can be split into " + count + " balanced partitions");
    }
}
