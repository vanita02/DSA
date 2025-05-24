
public class CopySingly {

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

    public void copyLink() {
        Node pre = first;
        Node save = first.link;
        while (save != null) {
            Node newnode = new Node(first.info);
            newnode.info = pre.info;
            pre = pre.link;
            newnode.info = save.info;
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
        CopySingly cs = new CopySingly();
        cs.addFirst(4);
        cs.addFirst(3);
        cs.addFirst(2);
        cs.addFirst(1);
        System.out.print("old linklist is :  ");
        cs.print();
        System.out.println();
        cs.copyLink();
        System.out.print("copy linklist is :  ");
        cs.print();
    }
}
