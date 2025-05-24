public class Lab11_61 {
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info=data;
            this.link=null;
        }
    }
         Node first;
        // ENQUEUE
        public void enqueue(int data){
        Node newnode = new Node(data);
        if(first==null){
            first=newnode;
            return;
        }
        newnode.link = first;
        first=newnode;
    }

    // DEQUEUE
    public void dequeue(){
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
    public void print(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.info+" -> ");
            temp=temp.link;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Lab11_61 f = new Lab11_61();
        f.enqueue(9);
        f.enqueue(10);
        f.enqueue(2);
        f.enqueue(3);
        f.print();
        f.dequeue();
        f.print();
    }
}
