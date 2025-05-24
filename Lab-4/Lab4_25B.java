//Write a program to delete duplicate numbers from an array. 

import java.util.Scanner;
/**
 * Lab4_25B
 */
public class Lab4_25B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n =sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(a[i]==a[j]){
                    for (int j2 = j; j2 < n-1; j2++) {
                        a[j2] = a[j2+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        System.out.println("Array after deleting duplicate:");
        for (int i = 0; i < n-1; i++) {
            System.out.println("a["+i+"]= "+a[i]);
        }
    }
    }