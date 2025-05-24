
public class LFirst {
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
    public void print(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.info+" -> ");
            temp=temp.link;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LFirst f = new LFirst();
        f.addFirst(9);
        f.addFirst(10);
        f.addFirst(2);
        f.addFirst(3);
        f.print();
    }
}
