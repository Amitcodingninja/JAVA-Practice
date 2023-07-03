package Array;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class Question {
    static int [] kthSmallestAndLargestElements(int arr1[],int k)
    {
        Arrays.sort(arr1);
        int ans[]={arr1[k-1],arr1[arr1.length-1]};
        return  ans;
    }
    static int frequencyCount(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurence(int arr[], int x) {

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static boolean isSorted(int[] arr)

    {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("No. Of Frequency Of X in Array is : ");
        System.out.print(frequencyCount(arr, x));
        System.out.println("Last Occurence Of X is at Index : ");
        System.out.println(lastOccurence(arr, x));
        System.out.println();
        System.out.println("Is Sorted : " + isSorted(arr));
        int k=sc.nextInt();
        int ans[]=kthSmallestAndLargestElements(arr,k);
        System.out.println(k+"Smallest : "+ans[0]);
        System.out.println(k+"Largest : "+ans[1]);
    }
}


/*

package Array;

//import java.util.*;

public class CountOccurence {

    static int frequencyCount(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurence(int arr[], int x) {

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static boolean isSorted(int[] arr)

    {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("Enter x: ");
         int x = sc.nextInt();
         System.out.println("No. Of Frequency Of X in Array is : ");
         System.out.print(frequencyCount(arr, x));
         System.out.println("Last Occurence Of X is at Index : ");
         System.out.println(lastOccurence(arr, x));
         System.out.println();
        System.out.println("Is Sorted : " + isSorted(arr));


    }

}
 */