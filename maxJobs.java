import java.util.Arrays;
import java.util.Comparator;

public class maxJobs {
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20}, {1,10}, {1,40},{1,30}}; //{deadline, profit}
        //sort on the basis of profit
        Arrays.sort(jobsInfo, Comparator.comparingDouble(o -> o[1]));
        
        int time = 0;
        for(int i=jobsInfo.length-1; i>=0; i--){
            if(jobsInfo[i][0] > time){
            System.out.println(jobsInfo[i][1]);
            time++;
            }
        }
    }
}
