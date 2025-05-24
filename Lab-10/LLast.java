
    public class LLast {
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
        public void print(){
            Node last=first;
                while(last!=null){
                    System.out.print(last.info+" -> ");
                    last=last.link;
                }
                System.out.println("null");
        }
        public static void main(String[] args) {
            LLast l = new LLast();
            l.addFirst(9);
            l.addFirst(10);
            l.addFirst(2);
            l.addFirst(3);
            l.addLast(7);
            l.addLast(8);
            l.addLast(0);
            l.print();
        }
    }