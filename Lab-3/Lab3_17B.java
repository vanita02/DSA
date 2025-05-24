//Write a program to find whether the array contains a duplicate number or not.

import java.util.*;
/**
 * Lab3_17B
 */
public class Lab3_17B {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;

        for(int i=0;i<a.length;i++){
            System.out.println("Enter array element a["+i+"] = ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-1;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        if(count!=0){
            System.out.println("Array is contains Duplicate number");
        }
        else{
            System.out.println("Array is not contains Duplicate number");
        }
    }
}