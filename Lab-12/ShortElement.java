
public class ShortElement {

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

    public void shortList() {
        Node save = first;
        while (save != null) {
            Node min = save;
            Node next = save.link;
            while (next != null) {
                if (next.info < min.info) {
                    min = next;
                }
                next = next.link;
            }
            int abc = save.info;
            save.info = min.info;
            min.info = abc;

            save = save.link;

        }
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
        ShortElement s = new ShortElement();
        s.addFirst(2);
        s.addFirst(5);
        s.addFirst(9);
        s.addFirst(7);
        s.print();
        s.shortList();
        s.print();
    }
}
