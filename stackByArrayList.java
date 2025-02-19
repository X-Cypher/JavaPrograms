import java.util.ArrayList;
public class stackByArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public void pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
            }
            list.remove(list.size()-1);
        }

        //peek()
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){ //while not empty(while false)
            System.out.println(s.peek()); 
            s.pop(); //print then delete, then print next
        }
    }
}
