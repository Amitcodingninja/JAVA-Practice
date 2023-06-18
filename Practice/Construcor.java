package Practice;

public class Construcor {
    // Default Constructor
    // int i;
    // String s;

    // public static void main(String[] args) {
    // Construcor c = new Construcor();
    // System.out.println(c.i + " " + c.s);
    // }

    // No Default Constructor

    // Construcor()
    // {
    // System.out.println("No Argument Constructor");
    // }
    // public static void main(String[] args) {
    // Construcor c = new Construcor();
    // }

    // Parametrised Constructor

    Construcor(int a, String s) {
        System.out.println("Parametrised Constructor");
    }

    public static void main(String[] args) {
        Construcor c = new Construcor(5, "Amit Thakur");
    }
}
// Intialization Of Object 