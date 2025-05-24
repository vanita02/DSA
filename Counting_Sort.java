import java.util.*;



public class Counting_Sort{
    static Scanner sc = new Scanner(System.in);
    public static void countingSort(){
        System.out.println("enter array a size :");
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = a[0];
        System.out.println("enter array element : ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
           if(a[i]>max){
            max = a[i];
           
           }
        }

        int [] c = new int[max+1];
        for(int i=0; i<c.length; i++){
            c[i] = 0;
        }

        for(int i=0; i<a.length; i++){
            c[a[i]]++;
        }

        for(int i=1; i<c.length; i++){
            c[i] = c[i]+c[i-1];
        }

        int []b = new int[n];
        for(int i=n-1; i>=0; i--){
            b[c[a[i]]-1] = a[i];
            c[a[i]]--;
        }
        System.out.println("sorted array is : ");
        for(int k=0; k<b.length; k++){
            System.out.print(b[k]+" ");
        }
    }

    public static void main(String[] args) {
        countingSort();

    }
}