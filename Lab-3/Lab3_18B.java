//Read n numbers in an array then read two different numbers, replace 1st number with 2nd number in an array and print its index and final array.

import java.util.*;
public class Lab3_18B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the first number to be replaced: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second number to replace with: ");
        int secondNumber = sc.nextInt();

        boolean replaced = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == firstNumber) {
                a[i] = secondNumber;
                System.out.println("Replaced at index: " + i);
                replaced = true;
                break;
            }
        }

        if (!replaced) {
            System.out.println("The first number was not found in the array.");
        }

        System.out.println("Final array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}