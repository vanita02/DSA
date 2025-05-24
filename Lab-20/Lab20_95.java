import java.util.*;

public class Lab20_95 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
    }

    public static void countSort(int a[], int n, int place){
        System.out.println("enter array size : ");

        int output[] = new int[n];
        int count[] = new int[10];
        for(int i=0; i<10; i++){
            count[i] = 0;
        }
        for(int i=0; i<n; i++){
            count[(a[i]/place)%10]++;
        }
        for(int i=1; i<10; i++){
            count[i] += count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            output[count[(a[i]/place)%10]-1] = a[i];
            count[(a[i]/place)%10]--;
        }
        for(int i=0; i<n; i++){
            a[i] = output[i];
        }
        System.out.println("sorted array : ");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }

   

    public static int getMax(){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=n/2-1; i>=0; i++){
            countSort(a,n,i);
        }
        return n;
    }

    public static void radixSort(){
        int m = getMax();
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int place=1; m/place>0; place*=10){
            countSort(a,n,place);
        }
    }
}
