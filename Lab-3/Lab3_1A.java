import java.util.*;
public class Lab3_1A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length of an array:");
        int n=sc.nextInt();
        int arr[];
        arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter a number for arr["+i+"]= ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }
    }
}