import java.util.*;

public class Lab15_82 {
    static Scanner sc = new Scanner(System.in);

    static class Node {
        int info;
        Node left;
        Node right;

        public Node(int data) {
            this.info = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;
    static int i = 0;
    static int j = 0;

    static Node PrePostTraversal(int[] pre, int[] post) {

        Node root = new Node(pre[i]);
        i++;
        if (root.info != post[j]) {
            root.left = PrePostTraversal(pre, post);
        }
        if (root.info != post[j]) {
            root.right = PrePostTraversal(pre, post);
        }
        j++;
        return root;
    }

    public static void main(String[] args) {
        int[] pre = { 1,2,3,4,5,6 };
        int[] post = { 3,4,2,6,5,1};
        // for(int i=0; i<pre.length; i++){
        // pre[i] = sc.nextInt();
        // }
        // for(int j=0; j<pre.length; j++){
        // pre[j] = sc.nextInt();
        // }
        Node ans = PrePostTraversal(pre, post);
        System.out.println(ans.info);
    }
}