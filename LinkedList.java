public class LinkedList {
    public static class Node{
        int data;
        Node next; //object : an object is a variable of type Class(next is variable of type Node)
        public Node(int data){ //constructor
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    public int size;

    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data); //create new node
        size++;
        //For new Node
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index ,int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        // traverse to index-1
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void removeFirst(){
        size--;
        if(head == null || head.next == null){
            head = tail = null;
            return;
        }
        // next element ko head bna dia
        head = head.next;
    }

    public void removeLast(){
        size--;
        if(head == null || head.next == null){
            head = tail = null;
            return;
        }
        Node prev = head;
        for(int i = 0; i < size-1; i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null){
            next = current.next;
            current.next = prev; //linked to previous Node
            prev = current;
            current = next;
        }
        prev = head; //we didnot do current = head, because after the loop current = null
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(6);
        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.addMiddle(4, 6);
        ll.print();
        ll.reverse();
        System.out.println("The size of LinkedList is : " + ll.size);
       
    }
}
