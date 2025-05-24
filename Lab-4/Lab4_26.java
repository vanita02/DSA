import java.util.*;
public class Lab4_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of first array n: ");
        int n=sc.nextInt();
        System.out.println("Enter length of second array m: ");
        int m=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[m];

        for(int i=0;i<a.length;i++){
            System.out.println("Enter an array element a["+i+"] = ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++){
            System.out.println("Enter an array element b["+i+"] = ");
            b[i]=sc.nextInt();
        }
        int c[]=new int[m+n];
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            else{
                c[i]=b[i-n];
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("c["+i+"] = "+c[i]);
        }
    }
}