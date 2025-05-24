public class Lab11_60 {
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info=data;
            this.link=null;
        }
    }
         Node first;
        // PUSH
         public void push(int data){
        Node newnode = new Node(data);
        if(first==null){
            first=newnode;
            return;
        }
        newnode.link = first;
        first=newnode;
    }

    // POP
    public void pop(){
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
        Lab11_60 f = new Lab11_60();
        f.push(9);
        f.push(10);
        f.push(2);
        f.push(3);
        f.print();
        System.out.println();
        f.pop();
        f.print();
    }
}


