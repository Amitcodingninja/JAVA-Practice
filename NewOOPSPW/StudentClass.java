package NewOOPSPW;

// import java.util.Scanner;

// Scanner class yad hai 
public class StudentClass {

    public static void main(String[] args) {

        Student s1 = new Student("Amit", 01, 100);
        System.out.println(s1.name + " " + s1.rno + " " + s1.percent);
        System.out.println(s1.noOfStudent);
Student s2=new Student("Papa", 23, 89);
System.out.println(s2.noOfStudent);
        // s1.name = "Amit Thakur";
        // s1.roll = 01;
        // s1.setRno();
        // s1.percent = 100;
        // System.out.println(s1.name + " " + s1.setRno(20); + " " + s1.percent);

        // s1.setRoll(20);

        // System.out.print(s1.setRoll(20));
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Put The Value Of a");
        // int a = sc.nextInt();
        // System.out.println(a);
    }
}

// public static class Student {

// private String name;
// private int rno;
// private double percent;

// public int getRno() {
// return rno;
// }

// public void setRno(int rno) {
// this.rno = rno;
// }

// public String getName() {
// return name;
// }

// public void setName(String name) {
// this.name = name;
// }

// public double getPercent() {
// return percent;
// }

// public void setPercent(double percent) {
// this.percent = percent;
// }
// };

// public static void main(String[] args) {

// Student s1 = new Student();

// s1.setName("Amit Thakur");
// s1.setRno(20);
// s1.setPercent(100.0);

// System.out.println(s1.getName() + " " + s1.getRno() + " " + s1.getPercent());

// }
// }