package Searching;

public class BinarySearch {
    static int bSearch(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 29, 32, 43, 40, 15 }, n = 6;

        int x = 10;
        System.out.println(bSearch(arr, n, x));

    }
}
