import java.util.*;
public class Lab3_4A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter an array element a["+i+"] = ");
            a[i]=sc.nextInt();
        }
        int s=0,si=0;
        int l=0,li=0;
        for(int i=0;i<n;i++){
            if(a[i]<a[0]){
                s=a[i];
                si=i;
            }
            else if(a[i]>a[0]){
                l=a[i];
                li=i;
            }
        }
    
        System.out.println("Smallest number's index = "+si);
        System.out.println("Largest number's index = "+li);
    }
}
