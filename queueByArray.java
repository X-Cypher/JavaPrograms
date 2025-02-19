public class queueByArray {
    static class Queue{
        static int size;
        static int rear; //index of last element
        static int front; //index of first element
        static int arr[];
        Queue(int n){
            rear = -1;
            size = n;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            return rear == -1; //if(rear == -1) return true
        }
        //add
        public void add(int data){  //O(1)
            if(rear == size-1){
                System.out.println("The Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        // remove
        public void remove(){   //O(n)
            if(isEmpty()){
                System.out.println("Queue is already empty");
                return;
            }
            //shift every element 
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
        }
        //peek
        public int peek(){  //O(1)
            if(isEmpty()){
                System.out.println("The Queue is empty");
                return -1;
            }
            return arr[0];
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
