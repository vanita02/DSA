
import java.util.*;

public class Lab18_90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("enter erray element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key : ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("element is : " + arr[i]);
                return;
            } else {
                System.out.println("element not found!!");
            }
        }
    }
}

