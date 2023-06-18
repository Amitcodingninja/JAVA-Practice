package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(Strings[] args) {

        // Array is an object store similar type of data in a contigous memory location
        // .... Out put ke time mai for each loop use krna hai

        // int arr[] = { 10, 20, 30, 40, 50 };
        // int arr[] = new int[5];
        // System.out.println("Enter Array Elements ");
        // Scanner s = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        // arr[i] = s.nextInt();
        // }
        // // For Sorting We Use
        // Arrays.sort(arr);

        // System.out.println("\nArray Elements : ");
        // // for (int b : arr) {
        // // System.out.println(b + " ");
        // // }

        // for (int b : arr) {
        // System.out.print(b + " ");
        // }

int[][] a = new int[2][2];

System.out.println("Enter Array Elements : ");
Scanner s = new Scanner(System.in);

for (int i = 0; i < a.length; i++) {
  for (int j = 0; j < a[i].length; j++) {
    a[i][j] = s.nextInt();
  }
}

System.out.println("\nMatrix Elements : ");
for (int i = 0; i < a.length; i++) {
  for (int j = 0; j < a[i].length; j++) {
    System.out.print(a[i][j] + " ");
  }
  System.out.println();
}

    }
}