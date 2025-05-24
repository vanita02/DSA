
import java.util.*;

public class BinarySearchImplimentation {

    static class Node {

        int info;
        Node left;
        Node right;

        public Node(int x) {
            this.info = x;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;

    // INSERT
    static Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data > root.info) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    // DELETE
    static Node delete(int data) {
        root = deleteRec(root, data);
        return root;
    }

    static Node deleteRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.info > data) {
            root.left = deleteRec(root.left, data);
        } else if (root.info < data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.info = minValue(root.right);
            root.right = deleteRec(root.right, root.info);
        }
        return root;
    }

    static int minValue(Node root) {
        int minValue = root.info;
        while (root.left != null) {
            minValue = root.left.info;
            root = root.left;
        }
        return minValue;
    }

    // SEARCH
    static boolean search(int data) {
        return searchRec(root, data);
    }

    static boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.info == data) {
            return true;
        } else if (data < root.info) {
            return searchRec(root.left, data);
        } else if (data > root.info) {
            return searchRec(root.right, data);
        }
        return false;
    }

    // PRINT
    static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.info + " -> ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        root = insert(root, 4);
        root = insert(root, 5);
        root = insert(root, 2);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 9);
        // root = insert(root, 8);
        preorder(root);
        // delete(5);
        // System.out.println();
        // System.out.println("deleted : ");
        // preorder(root);
        // System.out.println();
        boolean ans = search(8);
        System.out.println();
        if (ans == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        preorder(root);
    }
}
