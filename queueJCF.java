import java.util.*;
import java.util.LinkedList;

public class queueJCF {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>(); //we use LinkedList because Queue is an Interface
        q.add(1);                                  // We can not create objects of Interface
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
