class DoublyLinkedList {

    // Node class for doubly linked list
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    Node head; // Start of DLL

    // Insert at beginning
    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
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
        newNode.prev = temp;
    }

    // Delete from start
    public void deleteStart() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    // Delete from end
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // Display all nodes
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Doubly Linked List: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Main method to test DLL
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtStart(30);
        dll.insertAtStart(20);
        dll.insertAtEnd(40);
        dll.insertAtEnd(50);

        dll.display();

        dll.deleteStart();
        dll.display();

        dll.deleteEnd();
        dll.display();
    }
}
