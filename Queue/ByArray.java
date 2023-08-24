package Queue;

public class ByArray {

    class Queue {
        int front, rear;
        int capacity;
        int[] array;

        Queue(int cap) {
            capacity = cap;
            front = 0; // Corrected: Start the front from index 0
            rear = -1;
            array = new int[capacity];
        }

        boolean isFull() {
            if (rear == capacity - 1) {
                System.out.println("Overflow, can't Enqueue");
                return true;
            }
            return false;
        }

        boolean isEmpty() {
            if (front == -1) {
                System.out.println("Underflow, can't Dequeue");
                return true;
            }
            return false;
        }

        // For Add An Item
        void enqueue(int Item) {
            if (isFull())
                return;
            rear++;
            array[rear] = Item;
            System.out.println(Item + " Enqueued to Queue ");
        }

        int dequeue() {
            if (isEmpty())
                return Integer.MIN_VALUE;

            int item = array[front];
            front++;

            // Resetting the queue when the last item is Dequeued
            if (front > rear)
                front = rear = -1;

            System.out.println(item + " dequeued from the Queue");
            return item;
        }

        int front() {
            if (isEmpty())
                return Integer.MIN_VALUE;

            return array[front];
        }

        int rear() {
            if (isEmpty())
                return Integer.MIN_VALUE;
            return array[rear];
        }
    }

    public static void main(String[] args) {
        ByArray byArray = new ByArray(); // Create an instance of the class
        Queue queue = byArray.new Queue(5);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();

        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
    }

}
