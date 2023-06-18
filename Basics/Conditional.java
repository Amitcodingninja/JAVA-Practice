package Basics;

import java.util.Scanner;

public class Conditional {
    public static void main(Strings[] args) {
        int pwd;
        System.out.println("Enter Password= ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 123) {
            System.out.println("My Name Is Amit Thakur ");
            System.out.println("My Age : = 22");
            System.out.println("My Contact :- 9876543345");
        } else {
            System.out.println("Sahi Wala Pass Word daliye");
        }
    }
}
