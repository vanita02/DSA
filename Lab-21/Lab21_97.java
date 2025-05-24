
import java.util.*;

public class Lab21_97 {

    static Scanner sc = new Scanner(System.in);

    public static void quickSort(int arr[], int lb, int j) {
        boolean flag = true;
        lb = 0;
        int ub = arr.length-1;
        int i = 0;
        j = arr.length;
        if (lb < ub) {
            i = lb;
            j = ub + 1;
            int key = arr[lb];

            while (flag = true) {
                i++;
                while (arr[i] < key) {
                    i++;
                }
                j--;
                while (arr[j] > key) {
                    j--; 
                }
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    flag = false;
                }
            }  
        }
        int temp = arr[lb];
        arr[lb] = arr[j];
        arr[j] = temp;
        quickSort(arr, lb, j - 1);
        quickSort(arr, j + 1, ub);

        System.out.println("sorted array is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String[] args) {
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length - 1);
    }
}
