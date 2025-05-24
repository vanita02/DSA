
public class RemoveDuplicate {

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

    // remove duplicate
    public void remove_Duplicate() {
        Node pred = first;
        Node save = first.link;
        while (save.link != null) {
            if (pred.info == save.link.info) {
                pred.link = save.link.link;
            }
            pred = pred.link;
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
        RemoveDuplicate rd = new RemoveDuplicate();
        rd.addFirst(6);
        rd.addFirst(5);
        rd.addFirst(5);
        rd.addFirst(4);
        rd.addFirst(4);
        rd.print();
        rd.remove_Duplicate();
        rd.print();
    }
}
