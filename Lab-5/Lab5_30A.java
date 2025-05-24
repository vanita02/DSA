//Read two 2x2 matrices and perform addition of matrices into third matrix and print it 

import java.util.*;
public class Lab5_30A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a[][]=new int[2][2];
        int b[][]=new int[2][2];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.println("Enter an array element a["+i+"] = ");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.println("Enter an array element b["+i+"] = ");
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[2][2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
