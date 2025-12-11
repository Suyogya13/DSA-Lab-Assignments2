import java.util.Scanner;

class CircularQueue {

    int front, rear, size;
    int[] arr;

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Check Empty
    boolean isEmpty() {
        return front == -1;
    }

    // Check Full
    boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Enqueue (Push)
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Full! Cannot insert.");
            return;
        }
        if (front == -1) {       // first element
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        System.out.println(value + " inserted.");
    }

    // Dequeue (Pop)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty! Cannot delete.");
            return -1;
        }

        int value = arr[front];

        if (front == rear) {    // only one element left
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        System.out.println(value + " removed.");
        return value;
    }

    // Display Queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Circular Queue: ");
        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class Question21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue(5);

        while (true) {
            System.out.println("1. Enqueue (Push)");
            System.out.println("2. Dequeue (Pop)");
            System.out.println("3. isEmpty");
            System.out.println("4. isFull");
            System.out.println("5. Display");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter value: ");
                int v = sc.nextInt();
                q.enqueue(v);
            }
            else if (ch == 2) {
                q.dequeue();
            }
            else if (ch == 3) {
                System.out.println("isEmpty: " + q.isEmpty());
            }
            else if (ch == 4) {
                System.out.println("isFull: " + q.isFull());
            }
            else if (ch == 5) {
                q.display();
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }
    }
}
