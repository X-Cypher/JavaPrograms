public class queueByLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty(){
            return head == null && tail == null;
        } 

        public void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void remove(){
            if(isEmpty()){
                System.out.println("Queue is already empty");
                return;
            }
            //single element
            if(head == tail){
                head = tail = null;
                return;
            }
            head = head.next; //for queue, we remove the first element
        }

        public int peek(){
            if(head == null){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
            q.add(5);
            q.add(10);
            q.add(15);
            q.add(20);
            q.add(25);
            while(!q.isEmpty()){
                System.out.print(q.peek() + " ");
                q.remove();
        }
        System.out.println(q.peek());
    }
}
