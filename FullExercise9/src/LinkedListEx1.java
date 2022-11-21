import java.util.LinkedList;

public class LinkedListEx1 {
    class Node {
        int data;
        Node next;
        Node head;

        Node(int value) {
            data = value;
            next = null;
        }

        Node(){
        head =null;
    }

        public void addFirst(int value) {
            Node newNode = new Node(value);

            if (head == null)
                head =newNode;
            else{
                newNode.next=head;
                head=newNode;
            }
        }
        public void indexOf(){
            Node temp=head;
            while(temp!= null){
                System.out.println(temp.data + " ");
                temp=temp.next;
            }
        }
        public void addLast(int pos,int value){
            Node newNode= new Node(value);
            Node temp=head;
            for(int i=1; i<pos; i++){
                temp=temp.next;
                if(temp==null){
                    System.out.println("invalid position");//throw new IllegalArgumentException("invalid position)
                    return;
                }
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
}