import java.util.ArrayList;

public class swapArrayList {
    public static void Swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(0);
        System.out.println(list);
        Swap(list, 4, 2);
        System.out.println(list);
    }
}
