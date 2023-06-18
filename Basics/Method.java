package Basics;

public class Method {
    // 1. Method runs only when it called
    // 2. Code Reusability
    // Method is the block of code

    // Type 1. Pre Defined 2. User Defined
    // 1. print(); 2. Sort(); 3.nextInt 4.sleep 5.Concat();
    // Syntax:- return-type method-name(parameter){statement ; return;} ;

    // Main is also a user defined method but it is call by JVM

    // static na hota to object bnana padta

    public static void main(Strings[] args) {
        // // int r = Sum(4, 5);
        // Sum();
        // System.out.println("Addition " );
        // }

        // static int Sum(int a, int b)
        // {
        // return a + b;
        // }
        // static void Sum() {
        // System.out.println("Learn Coding ");
        // }

      // Creating an object of the class `Method` and assigning it to the reference variable `m`. This
      // allows the method `Sum()` to be called using the object `m`.
        Method m = new Method();
        m.Sum();

    }

    void Sum() {
        System.out.println(" Amit Thakur Is Great");
    }
}