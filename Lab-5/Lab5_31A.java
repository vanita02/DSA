//Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in third matrix and print it.

import java.util.*;
public class Lab5_31A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrixA = new int[3][2];
        int[][] matrixB = new int[2][3];
        int[][] resultMatrix = new int[3][3];

        System.out.println("Enter the elements of the first matrix (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Resulting matrix after multiplication (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}