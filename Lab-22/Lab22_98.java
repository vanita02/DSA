import java.util.*;

public class Lab22_98{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        heapSort();
    }
    public static void heapify( int arr[],int n, int i){
        int maxindex = i;
        int leftchild = 2*i+1;
        int rightchild = 2*i+2;
        if(leftchild<n && arr[leftchild]>arr[maxindex]){
            maxindex = leftchild;
        }
        if(rightchild<n && arr[rightchild]>arr[maxindex]){
            maxindex = rightchild;
        }
        if(i != maxindex){
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
            heapify(arr,n,maxindex);
        }
    }
    public static void buildMaxHeap(int arr[]){
        int n = arr.length;
        for(int i = n/2-1; i>=0; i--){
            heapify(arr,n,i);
        }
    }

    public static void heapSort(){
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements : ");
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        buildMaxHeap(arr);
        for(int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        for(int i=0; i<=n-1; i++){
           System.out.print(arr[i]+" ");
        }
    }    
}