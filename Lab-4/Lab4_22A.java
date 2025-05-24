import java.util.*;
/**
 * Lab4_22A
 */
public class Lab4_22A {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter length of an array:");
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<a.length;i++){
                System.out.println("Enter array element a["+i+"]:");
                a[i]=sc.nextInt();
            }
            System.out.println("Enter a position where number to be deleted p:");
            int p=sc.nextInt();
            int b[]=new int[n-1];
            for(int i=0;i<b.length;i++){
                if(i<p){
                    b[i]=a[i];
                }
                else{
                    b[i]=a[i+1];
                }
                System.out.println("a["+i+"] = "+b[i]);
            }
    }
}