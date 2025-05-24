import java.util.*;

class Insertion{
    Scanner sc = new Scanner(System.in);
    public void insertionSort(){
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for(int k=0; k<arr.length; k++){
            arr[k] = sc.nextInt();
        }
        int i=1;
        while(i<n){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            i++;
        }
        System.out.println("sorted array is : ");
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}


public class Lab19_93 {
    public static void main(String[] args) {
        Insertion i = new Insertion();
        i.insertionSort();
    }
 
}
