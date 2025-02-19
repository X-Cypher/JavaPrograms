public class stackByLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    static class Stack{
        static Node head = null;

        public boolean isEmpty(){
            return head == null;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public void pop(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return;
            }
            head = head.next;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
