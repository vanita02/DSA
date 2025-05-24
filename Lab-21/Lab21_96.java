
import java.util.*;

public class Lab21_96 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter array element : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int high = a.length - 1;
        int low = 0;
        mergeSort(a, low, high);

        for (int k = 0; k <= high; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void mergeSort(int[] a, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, high, mid);

        }
    }

    public static void merge(int[] a, int low, int high, int mid) {
        int[] b = new int[high-low+1];
        int h = low;
        int i = low;
        int j = mid + 1;
        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i-low] = a[h];
                h++;
            } else {
                b[i-low] = a[j];
                j++;
            }
            i++;
        }
        while (h <= mid) {
            b[i-low] = a[h];
            h++;
            i++;

        }
        while (j <= high) {

            b[i-low] = a[j];
            j++;
            i++;

        }
        for (int k = low; k <= high; k++) {
            a[k] = b[k-low];
        }

    }

}
