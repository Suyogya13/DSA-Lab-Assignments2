import java.util.Scanner;

class Stack {
    int top;
    int size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push.");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        System.out.println(arr[top] + " popped from stack.");
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Question20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack s = new Stack(5);

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. isEmpty");
            System.out.println("4. isFull");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                s.push(val);
            }
            else if (choice == 2) {
                s.pop();
            }
            else if (choice == 3) {
                System.out.println("isEmpty: " + s.isEmpty());
            }
            else if (choice == 4) {
                System.out.println("isFull: " + s.isFull());
            }
            else if (choice == 5) {
                s.display();
            }
            else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid Choice!");
            }
        }
    }
}
