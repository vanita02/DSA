import java.util.*;

public class Lab_7_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lab_7_38 s1 = new Lab_7_38(8);
        s1.push(2);
        s1.push(5);
        s1.push(7);
        s1.push(9);
        s1.display();
        // System.out.println();
        // boolean flag = true;
        // while(flag){
        // System.out.println("enter 1 for push // enter 2 for pop // enter 3 for peep
        // // enter 4 for change // enter 5 for stop :");
        // System.out.println("ener operation : ");
        // int operation = sc.nextInt();
        // switch(operation){
        // case 1 -> {
        // s1.push(6);
        // System.out.println("pushed element is : ");
        // s1.display();
        // System.out.println();
        // break;
        // }
        // case 2 -> {
        // s1.pop();
        // System.out.println("poped element is : ");
        // s1.display();
        // System.out.println();
        // break;
        // }
        // case 3 -> {
        // s1.peep();
        // System.out.println("peeped element is : ");
        // s1.display();
        // System.out.println();
        // break;
        // }
        // case 4 -> {
        // s1.change();
        // System.out.println("changed element is : ");
        // s1.display();
        // System.out.println();
        // break;
        // }
        // case 5 -> flag = false;
        // }
        // }

    }

    Scanner sc = new Scanner(System.in);
    int n;
    int top;
    int s[];

    public Lab_7_38(int n) {
        s = new int[n];
    }

    public int push(int x) {
        System.out.println("enter x : ");
        x = sc.nextInt();
        if (top >= n - 1) {
            System.out.println("stack overflow !!");
        } else {
            top++;
            s[top] = x;
            return s[top];
        }
        return x;
    }

    public int pop() {
        if (top == (-1)) {
            System.out.println("stack underflow !!");
            return 0;
        } else {
            top--;
            return s[top + 1];
        }
    }

    public int peep() {
        int i = sc.nextInt();
        if (top - i <= -1) {
            System.out.println("stack underflow !!");
        } else {
            return s[top - i];            
        }
        return i;
    }

    public void change() {
        int a = sc.nextInt();
        int i = sc.nextInt();
        if (top - i <= -1) {
            System.out.println("stack underflow !!");
        } else {
            s[top - i] = a;
        }
    }

    public void display() {
        if (top <= 0) {
            System.out.println("Stack Underflow");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(s[i] + " , ");
            }
        }
    }
}