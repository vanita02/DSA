import java.util.*;
public class Lab4_1A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter array element a["+i+"]:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a position where number to be inserted p:");
        int p=sc.nextInt();
        int b[]=new int[n+1];
        System.out.println("Enter a number c:");
        int c=sc.nextInt();
        for(int i=0;i<b.length;i++){
            if(i<p){
                b[i]=a[i];
            }
            else if(i==p){
                b[i]=c;
            }
            else{
                b[i]=a[i-1];
            }
            System.out.println(b[i]);
        }
    }
}