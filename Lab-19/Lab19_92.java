
import java.util.*;

class Bubble {

    Scanner sc = new Scanner(System.in);

    public void bubbleSort() {
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int last = n - 1;
        int count = 0;
        for (int i = 0; i < last; i++) {
           
            for (int j = 0; j < last; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
           
        }
        if (count == 0) {
            System.out.println("array already sorted");
            // return;
        } else {
            last--;
        }
        System.out.println("sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

public class Lab19_92 {

    public static void main(String[] args) {
        Bubble b = new Bubble();
        b.bubbleSort();
    }

}
