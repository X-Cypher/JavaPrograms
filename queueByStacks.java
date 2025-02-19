import java.util.Stack;

public class queueByStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){ //queue will be empty if s1 is empty
            return s1.isEmpty();
        }
        //Add : O(n) because loop is used
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop()); //jabtak s1 is not empty, add s1 elements to s2
            }
            s1.add(data); //when s1 becomes empty, simply add the element
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //Remove
        public void remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is already empty");
                return;
            }
            s1.pop();
        }

        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is already empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
