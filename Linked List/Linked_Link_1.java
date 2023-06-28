import org.w3c.dom.Node;

public class Linked_Link_1 {
    Node head;

    static class Node
    {
        int data;
        Node next;
        // Constructor Calling 
        Node (int d){
            data =d;
            next=null;
        }
    }
  // Method to create a simple linked list with 3 nodes


    public static void main(String[] args) {
       Linked_Link_1 list= new Linked_Link_1();
       list.head=new Node(1);
       list.head=new Node(2);
       list.head=new Node(3); 


    //    list.head.next=second;
    //    second.next=third;
    }
    
}