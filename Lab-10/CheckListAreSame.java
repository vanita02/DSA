
public class CheckListAreSame {

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

    public void addFirst2(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        newnode.link = first;
        first = newnode;
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
        CheckListAreSame c1 = new CheckListAreSame();
        c1.addFirst(9);
        c1.addFirst(10);
        c1.addFirst(2);
        c1.addFirst(3);
        c1.print();
        CheckListAreSame c2 = new CheckListAreSame();
        c2.addFirst2(9);
        c2.addFirst2(10);
        c2.addFirst2(2);
        c2.addFirst2(3);
        c2.print();
        if (c1 == c2) {
            System.out.println("list are same");
        } else {
            System.out.println("list are not same");
        }

    }
}
