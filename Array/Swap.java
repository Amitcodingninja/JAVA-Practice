package Array;

public class Swap {
    static void swapWithTemp(int a, int b) {
        System.out.println("Original Value Before Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Original Value Before Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static void swapWithoutTemp(int a, int b) {
        System.out.println("Original Value Before Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Original Value Before Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        System.out.println("Swap With Temp");
        swapWithTemp(a, b);
        System.out.println("Swap Without Temp");
        swapWithTemp(a, b);
    }
}
