public class LDeleteLast {
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
    public void print(){
//for addfirst
                Node temp = first;
                while(temp!=null){
                    System.out.print(temp.info+" -> ");
                    temp=temp.link;
                }
//for deleteLast
        while(temp!=null){
            System.out.print(temp.info+" -> ");
            temp=temp.link;
        }
        System.out.println("null");
    }
            
    public static void main(String[] args) {
        LDeleteLast dl = new LDeleteLast();
        dl.addFirst(4);
        dl.addFirst(5);
        dl.addFirst(6);
        dl.addFirst(7);
        dl.deleteLast();
        dl.print();
    }
}