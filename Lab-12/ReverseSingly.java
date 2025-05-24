
public class ReverseSingly {

    class Node {

        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }
    Node first;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        newnode.link = first;
        first = newnode;
    }

    public void reverseLink() {
        Node pre = first;
        Node save = first.link;
        while (save != null) {
            Node newnode = save.link;
            save.link = pre;
            pre = save;
            save = newnode;
        }
        first.link = null;
        first = pre;
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
        ReverseSingly r = new ReverseSingly();
        r.addFirst(4);
        r.addFirst(3);
        r.addFirst(2);
        r.addFirst(1);
        r.print();
        r.reverseLink();
        r.print();
    }
}
