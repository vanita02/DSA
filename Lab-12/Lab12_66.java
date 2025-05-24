import java.util.*;

public class Lab12_66 {
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


    public void swap(){
        Scanner sc = new Scanner(System.in);
        if(first == null){
            System.out.println("underflow!!");
        }
        int n = sc.nextInt();
        int c = 0;
        Node save = first;
        Node prev = save;
        while (save != null) {
            first = save.link;
            prev = first.link;
            c++;
        }
        for(int i=c; i<prev.info; i++){
            if(prev.info == c && first.info == c) {
                int temp = prev.info;
                prev.info = first.info;
                first.info = temp;
                }
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
        Lab12_66 c = new Lab12_66();
        c.addFirst(5);
        c.addFirst(4);
        c.addFirst(3);
        c.addFirst(2);
        c.addFirst(1);
        c.print();
        c.swap();
        c.print();
    }
}
