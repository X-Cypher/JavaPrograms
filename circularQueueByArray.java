public class circularQueueByArray {
    static class Queue{
        static int size;
        static int rear; //index of last element
        static int front; //index of first element
        static int arr[];
        Queue(int n){
            rear = -1;
            front = -1;
            size = n;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            return rear == -1; //if(rear == -1) return true
        }
        public static boolean isFull(){
            if((rear+1) % size == front){ //if rear and front reach at same index then we can't add new element
                return true;              //because front pe pehle se element hai
            }
            return false;
        }
        //add
        public void add(int data){
            if(isFull()){
                System.out.println("The Queue is full");
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

            if(front == -1){ //for addition of first element
                front = 0;
            }
        }
        // remove
        public void remove(){
            if(isEmpty()){
                System.out.println("Queue is already empty");
                return;
            }
            if(front == rear){ //removing last element
                front = rear = -1;
            } else{
                front = (front+1) % size;
            }
            return;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("The Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(5);
            q.add(10);
            q.add(15);
            q.add(20);
            q.add(25);
            while(!isEmpty()){
                System.out.print(q.peek() + " ");
                q.remove();
            }
        }
    }
}
