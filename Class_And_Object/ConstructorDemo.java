package Class_And_Object;

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student(2);
        Student s2 = new Student(3, 100f);
        s.display();
        s1.display();
        s2.display();
    }
}

class Student {
    private int rollNo;
    private float marks;

    public Student() {
        rollNo = 1;
        marks = 98;
    }

    public Student(int r) {
        rollNo = r;
        marks = 99;
    }

    public Student(int r, float m) {
        rollNo = r;
        marks = m;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo + " Marks : " + marks);
    }
}