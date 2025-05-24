
public class LDeleteFirst {
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info=data;
            this.link=null;
        }
    }
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
    Node save=first;
    public void deleteFirst(){
        if(first == null){
            System.out.println("empty !!");
        }
        first=first.link;
    }
    public void print(){
//for addfirst
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.info+" -> ");
            temp=temp.link;
        }
//for deletefirst
        while(save!=null){
            System.out.print(save.info+" -> ");
            save=save.link;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LDeleteFirst df = new LDeleteFirst();
        df.addFirst(4);
        df.addFirst(5);
        df.addFirst(6);
        df.addFirst(7);
        df.deleteFirst();
        df.print();
    }
}
