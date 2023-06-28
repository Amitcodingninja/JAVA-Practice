package LinkedList;

public class basicsll {

    // Now Its Recursion Tern 
    public static void displayr(Node head) {
        if (head == null)
            return;
        // System.out.println(head.data + " ");
        display(head.next);
        System.out.println(head.next + " ");
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // Printing a Linked List
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }
    public static int length(Node head)
    {
        int count=0;
        while (head !=null)
        {
            count++;
            head =head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        System.out.println();
        display(a);
        System.out.println();
        displayr(a);

        //
        // System.out.println(f.data);

        // for(int i=1;i<=5;i++)
        // {
        // System.out.print(temp.data+"-> ");
        // temp=temp.next;
        // }
    System.out.println(length(a));
    }
}
