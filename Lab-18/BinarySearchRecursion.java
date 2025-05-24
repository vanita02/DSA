
import java.util.*;

class Binary {

    Scanner sc = new Scanner(System.in);

    public void binarySearch() {
        System.out.println("enter array size : ");
        int n = sc.nextInt();

        int left = 0;
        int right = n - 1;
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key : ");
        int key = sc.nextInt();
        // while (left <= right) {
        //     int middle = (left + right) / 2;
        //     if (arr[middle] == key) {
        //         binarySearch();
        //         System.out.println("element is : " + arr[middle] + "   found at index   " + middle);
        //         return;
        //     } else if (arr[middle] <= key) {
        //         left = middle + 1;
        //     } else {
        //         right = middle - 1;
        //     }
        // }
        while (left <= right) {
            int middle = (left + right) / 2;
            if (middle == arr[key]) {
                System.out.println(arr[middle] + " found at index " + middle);
            } else if (arr[middle] < key) {
                binarySearch();
            }
        }
        System.out.println("element not found!!");
    }
}

public class BinarySearchRecursion {

    public static void main(String[] args) {
        Binary b = new Binary();
        b.binarySearch();
    }
}
