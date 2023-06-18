package Basics;

public class Strings {
    public static void main(String[] args) {
        String str = "Amit Thakur";
        String str2 = new String("Amit Thakur");
        // int l = str.length();
        // System.out.println(l);
        // System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
        // if (str == str2) {
        if (str.equals(str2) ) {
            System.out.println("Both Are Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}


// String Are immutable means cant change
