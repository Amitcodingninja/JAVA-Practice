package OOPS;

public class classesobject {
    int age = 22;
    int weight = 90;
    String color = "Sawla";

    void eat() {
        System.out.println("I Am Eating Biryani ");
    }

    void Run() {
        System.out.println("I Am Running ");
    }

    public static void main(String[] args) {
        classesobject C = new classesobject();
        System.out.println(C.age);
        System.out.println(C.weight);
        System.out.println(C.color);
        C.eat();
        C.Run();
    }
}
