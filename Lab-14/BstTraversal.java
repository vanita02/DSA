public class BstTraversal {
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
        if (root.info < data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.info + " -> ");
        preorder(node.left);
        preorder(node.right);
    }

    static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.info + " -> ");
        inorder(node.right);
    }

    static void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.info + " -> ");
    }

    public static void main(String[] args) {
        root = insert(root, 4);
        root = insert(root, 5);
        root = insert(root, 2);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 9);
        root = insert(root, 8);
        System.out.print("preorder : ");
        preorder(root);
        System.out.println();
        System.out.print("inorder : ");
        inorder(root);
        System.out.println();
        System.out.print("postorder : ");
        postorder(root);
    }
}
