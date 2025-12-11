class BST {

    class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    Node root;

    // Insert
    Node insert(Node r, int val) {
        if (r == null) return new Node(val);
        if (val < r.data) r.left = insert(r.left, val);
        else if (val > r.data) r.right = insert(r.right, val);
        return r;
    }

    void insert(int val) { root = insert(root, val); }

    // Search
    boolean search(Node r, int key) {
        if (r == null) return false;
        if (r.data == key) return true;
        return key < r.data ? search(r.left, key) : search(r.right, key);
    }

    // Minimum value
    int min(Node r) {
        while (r.left != null) r = r.left;
        return r.data;
    }

    // Delete
    Node delete(Node r, int key) {
        if (r == null) return null;

        if (key < r.data) r.left = delete(r.left, key);
        else if (key > r.data) r.right = delete(r.right, key);
        else {
            if (r.left == null) return r.right;
            if (r.right == null) return r.left;
            r.data = min(r.right);
            r.right = delete(r.right, r.data);
        }
        return r;
    }

    void delete(int key) { root = delete(root, key); }

    // Inorder Traversal
    void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    public static void main(String[] args) {
        BST t = new BST();

        t.insert(50);
        t.insert(30);
        t.insert(70);
        t.insert(20);
        t.insert(40);

        System.out.print("Inorder: ");
        t.inorder(t.root);
        System.out.println();

        System.out.println("Search 40: " + t.search(t.root, 40));
        t.delete(30);

        System.out.print("After delete: ");
        t.inorder(t.root);
    }
}
