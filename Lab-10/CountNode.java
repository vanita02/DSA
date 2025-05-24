
public class CountNode {

    class Node {

        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }
    Node first;
    int c = 0;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        newnode.link = first;
        first = newnode;

    }

    // count node
    public void countNode() {
        while (first != null) {
            first = first.link;
            c++;
        }
        System.out.println("count of node are : " + c);
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CountNode f = new CountNode();
        f.addFirst(9);
        f.addFirst(10);
        f.addFirst(2);
        f.addFirst(3);
        f.addFirst(1);
        f.print();
        f.countNode();
    }
}
