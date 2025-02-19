import java.util.*;
import java.util.LinkedList;
public class stackByQueue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty(); //if both queue are empty, then Stack is empty
        }
        //Add
        public void push(int data){
            // jo bhi queue mai elements ho, usme hi add krna hai(add in non empty queue)
            if(!q1.isEmpty()){
                q1.add(data);
            } else{
                q2.add(data);
            }
        }
        //Remove: O(n)
        public void pop(){
            if(q1.isEmpty() && q2.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){ //if queue is empty, stop! -> top will contain last element
                        break;
                    }
                    q2.add(top);
                }
            } else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
        }
        //Peek O(n)
        public int peek(){
            if(q1.isEmpty() && q2.isEmpty()){
                System.out.println("The stack is empty");
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            } else{
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top; //last element is returned
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
