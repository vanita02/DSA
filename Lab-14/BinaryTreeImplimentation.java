
import java.util.*;

class Node {

    int info;
    Node left;
    Node right;

    public Node(int x) {
        this.info = x;
        this.left = null;
        this.right = null;
    }
}

class Tree {

    Node root;

    public Node constTree(int[] arr, int i) {
        if (i >= arr.length) {
            return null;
        }

        Node temp = new Node(arr[i]);
        temp.left = constTree(arr, i * 2 + 1);
        temp.right = constTree(arr, i * 2 + 2);
        return temp;

    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.info + " -> ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.info + " -> ");
        inorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.info + " -> ");
    }
}

public class BinaryTreeImplimentation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Tree t = new Tree();
        t.root = t.constTree(arr, 0);
        System.out.print("preorder : ");
        t.preorder(t.root);
        System.out.println();
        System.out.print("inorder : ");
        t.inorder(t.root);
        System.out.println();
        System.out.print("postorder : ");
        t.postorder(t.root);
    }
}
