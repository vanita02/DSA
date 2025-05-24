import java.util.*;
/**
 * Lab6_33A
 */

public class A {
    int a;
    int b;

void Swap(int a, int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
}
}

public class Lab6_33A {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    A obj = new A();
    System.out.println("Enter a:");
    int a= sc.nextInt();
    System.out.println("Enter b:");
    int b=sc.nextInt();

    Swap(a,b);
}   
}