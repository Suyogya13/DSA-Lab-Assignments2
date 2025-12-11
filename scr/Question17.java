import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {

    Node head;


    // Insert at start ------>>>>>>>>>


    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    // Insert at end ------>>>>>>>>


    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    // Insert at a given position -------->>>>>>>>>


    public void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    // Delete at start ---------->>>>>>>>>>>


    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }


    // Delete at end ------------>>>>>>>>>>


    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node prev = null;
        Node temp = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    // Delete at a given position --------------->>>>>>>>>>>


    public void deleteAtPosition(int pos) {
        if (pos == 1) {
            deleteAtStart();
            return;
        }

        Node temp = head;
        Node prev = null;

        for (int i = 1; i < pos; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        prev.next = temp.next;
    }

    // Search an element --------------->>>>>>>>>>>>


    public void search(int key) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Element not found!");
    }

    // Display list -------------->>>>>>>>>>>>>>>


    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Question17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        while (true) {
            System.out.println("\n MENU ----->>>>");
            System.out.println("1. Insert at Start");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Start");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Search");
            System.out.println("8. Display");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtStart(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(value, pos);
                    break;

                case 4:
                    list.deleteAtStart();
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    list.deleteAtPosition(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter element to search: ");
                    list.search(sc.nextInt());
                    break;

                case 8:
                    list.display();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
