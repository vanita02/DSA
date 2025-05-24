import java.util.*;

public class LDeletePosition{
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
//for addfirst
            Node temp = first;
            while(temp!=null){
                System.out.print(temp.info+" -> ");
                temp=temp.link;
            }
            System.out.println("null");
//for deleteposition
            while(temp!=null){
                System.out.println(temp.info+" -> ");
                temp=temp.link;
            }
        }
        public static void main(String[] args) {
            LDeletePosition dp = new LDeletePosition();
            dp.addFirst(40);
            dp.addFirst(30);
            dp.addFirst(20);
            dp.addFirst(10);
            dp.deletePosition();
            dp.print();
    }
}