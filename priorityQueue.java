import java.util.PriorityQueue;
public class priorityQueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        // method overriding
        // object sorting
        @Override
        public int compareTo(Student s){
            return this.rank - s.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();//put Comparator.reverseOrder() in bracket to sort in descending
        pq.add(new Student("A", 3));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 4));
        pq.add(new Student("D", 5));
        pq.add(new Student("E", 2));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
