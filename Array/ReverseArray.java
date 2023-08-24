package Array;

import java.util.Scanner;

public class ReverseArray {
    static int[] reveseArray(int[] arr,int j,int j ) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[j++] = arr[i];
        }
        int i = n - 1, j = 0;
        while (i >= 0) {
            ans[j++] = arr[i--];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
    }
}
