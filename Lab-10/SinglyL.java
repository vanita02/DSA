import java.util.Scanner;

public class SinglyL{
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info=data;
            this.link=null;
        }
    }
    // insert at first

     Node first;
    public void addFirst(int data){
        Node newnode = new Node(data);
            if(first==null){
                first=newnode;
                return;
            }
        newnode.link = first;
        first=newnode;
    }         

    // insert at last

    public void addLast(int data){
        Node newnode = new Node(data);
            if(first==null){
                first=newnode;
            }
            Node last=first;
            while(last.link!=null){
                last=last.link;
            }
                last.link=newnode;
    }

    // delete at first

    public void deleteFirst(){
        if(first == null){
            System.out.println("empty !!");
        }
        first=first.link;
    }

    // delete at last

    public void deleteLast(){
        if(first == null){
            System.out.println("empty !!");
            return;
        }
        Node pre=first;
        Node save = first.link;
        while(save.link!=null){
            pre=pre.link;
            save=save.link;
        }
        pre.link = null;
    }

    // delete at position
     public void deletePosition(){
            
            if(first==null){
                System.out.println("empty!!");
                return;
            }
            int i=0;
            Scanner sc = new Scanner(System.in);
            Node pre = first;
            Node save = first.link;
            int key=sc.nextInt();
            while(save!=null && i<key-1){
                pre=pre.link;
                save=save.link;
                i++;
            }
                pre.link=save.link;
        }

    public void print(){
        Node last=first;
            while(last!=null){
                System.out.print(last.info+" -> ");
                last=last.link;
            }
            System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyL sl = new SinglyL();
        sl.addFirst(9);
        sl.addFirst(10);
        sl.addFirst(2);
        sl.addFirst(3);
        sl.print();
        sl.addLast(7);
        sl.addLast(8);
        sl.addLast(0);
        sl.print();
        sl.deleteFirst();
        sl.print();
        sl.deleteLast();
        sl.print();
        sl.deletePosition();
        sl.print();
    }
}