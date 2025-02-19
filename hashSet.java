import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(0);
        set.add(null);
        set.add(5);
        set.add(8);
        System.out.println(set);
        
        LinkedHashSet<Integer> lhm = new LinkedHashSet<>();
        lhm.add(null);
        lhm.add(0);
        lhm.add(8);
        lhm.add(1);
        lhm.add(10);
        System.out.println(lhm);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(0);
        ts.add(8);
        ts.add(8);
        ts.add(2);
        // ts.add(null); we cannot add null in tree set because we can't sort null
        System.out.println(ts);
    }
}
