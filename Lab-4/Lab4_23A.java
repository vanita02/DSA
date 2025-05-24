import java.util.*;
public class Lab4_23A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length of an array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter array element a["+i+"] = ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number to be inserted x:");
        int x=sc.nextInt();
        int b[]=new int[n+1];
        boolean flag=true;
        for(int i=0;i<b.length-1;i++){
            if(a[i]<x){
                b[i]=a[i];
            }
            else if(flag){
                b[i]=x;
                flag=false;
                i--;
            }
            else if(a[i]>x){
                b[i+1]=a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("a["+i+"] = "+b[i]);
        }
    }
}