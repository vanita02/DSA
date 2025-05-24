
public class DLL {

    class Node {

        int info;
        Node lptr;
        Node rptr;

        public Node(int data) {
            this.info = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    Node head = null;
    Node tail = null;

    // insert at first
    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.lptr = null;
            newnode.rptr = head;
            head.lptr = newnode;
            head = newnode;
        }
    }

    // insert at last
    public void insertAtLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.rptr = null;
            newnode.lptr = tail;
            tail.rptr = newnode;
            tail = newnode;
        }
    }

    // insert at position
    public void insertAtPosition(int data, int key) {
        Node newnode = new Node(data);
        Node save = head;
        int count = 0;
        if (head == null) {
            head = newnode;
            tail = newnode;
        }
        while (save.rptr != null && count != key ) {
            save=save.rptr;
            count++;
        }
        if (key == 0) {
            newnode.rptr=head.rptr;
            head.rptr.lptr=newnode;
            head.rptr=newnode;
            newnode.lptr=head;
            return;
        }
        if (tail == save) {
           tail.rptr=newnode;
           newnode.lptr=tail;
           newnode.rptr=null;
            return;
        }
        save.rptr.lptr=newnode;
        newnode.rptr=save.rptr;
        save.rptr=newnode;
        newnode.lptr=save;
        
    }

    // // delete at first
    // public void deleteAtFirst() {
    //     Node save = head.rptr;
    //     if (head == null) {
    //         System.out.println("empty!!");
    //     }
    //     save.lptr = null;
    //     head = save;
    // }

    // // delete at last
    // public void deleteAtLast() {
    //     Node prev = tail.lptr;
    //     if (head == null) {
    //         System.out.println("empty!!");
    //     }
    //     prev.rptr = null;
    //     tail = prev;
    // }

    // delete at position
    public void deleteAtPosition(int key) {
        int count = 0;
        Node save = head;
        if (head == null) {
            System.out.println("empty!!");
        }
        if (head == tail) {
            head = null;
            tail = null;
        }
        while (save.rptr != null && count != key) {
            save = save.rptr;
            count++;
        }
        if (key == 0) {
            save.rptr.lptr = null;
            head = save.rptr;
            return;
        }
        if (tail == save) {
            save.lptr.rptr = null;
            tail = save.lptr;
            return;
        }
        save.lptr.rptr = save.rptr;
        save.rptr.lptr = save.lptr;

    }

    // display
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.rptr;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DLL d = new DLL();
        d.insertAtFirst(5);
        d.insertAtFirst(4);
        d.insertAtFirst(3);
        d.insertAtFirst(2);
        d.insertAtFirst(1);
        d.print();
        // System.out.println();
        // d.insertAtLast(6);
        // d.print();
        System.out.println();
        d.insertAtPosition(7,1);
        d.print();
        // System.out.println();
        // d.deleteAtFirst();
        // d.print();
        // System.out.println();
        // d.deleteAtLast();
        // d.print();
        // System.out.println();
        // d.deleteAtPosition(0);
        // d.print();
    }
}
