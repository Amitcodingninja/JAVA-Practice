package LinkedList;

import java.util.*;

// `import javax.swing.plaf.TableUI;` is importing the TableUI class from the javax.swing.plaf package.
// However, it is not being used in the code and can be removed.
import javax.swing.plaf.TableUI;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int val) {
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size())
            {
                System.out.println("Wrong Input");
            }

            Node newNode = new Node(val);
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
 
        int getAt(int idx){
            Node temp=head;
            for (int i = 1; i <=idx; i++) {
                temp=temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.display();
        System.out.println(ll.size());
        ll.insertAtHead(100);
        ll.display();
        ll.insertAt(3, 99);
        ll.display();
        System.out.println(ll.getAt(3));
    }
}
