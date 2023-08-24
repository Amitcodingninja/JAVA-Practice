// Input  : arr[] = {100, 200, 300, 400},  k = 2
// Output : 700

// Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
// Output : 39
// Explanation: We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
// import java.util.*;
public class Slidind_Window_1 {
    // static int max_sum_of_subarray(int arr[], int n, int k) {
    // int max_sum = 0;
    // for (int i = 0; i + k <= n; i++) {
    // int temp = 0;
    // for (int j = i; j < i + k; j++) {
    // temp += arr[j];

    // }
    // if (temp > max_sum)
    // max_sum = temp;
    // }
    // return max_sum;
    // }

    public static int maxSum(int arr[], int n, int k) {
        if (n < k) {

            System.out.println("Invalid");
            return -1;

        }

        int res = 0;

        for (int i = 0; i < k; i++)
            res += arr[i];
        int curr_sum = res;
        for (int i = k; i < n; i++) {
            curr_sum += arr[i] - arr[i - k];
            res = Math.max(res, curr_sum);

        }
        return res;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        // int max_sum = max_sum_of_subarray(arr, n, k);
        // System.out.println(max_sum);
        System.out.println(maxSum(arr, n, k));
    }
}
