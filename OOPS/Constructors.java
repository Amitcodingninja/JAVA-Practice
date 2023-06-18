package OOPS;

// import java.lang.reflect.Parameter;

//     class A {
//         int a;
//         String name;

//         // A() {
//         //     a = 0;
//         //     name = null;
//         // }

//         void show() {
//             System.out.println(a + " " + name);
//         }
//     }
// class B{
//     public static void main(String[] args) {
//         A ref = new A();
//         ref.show();
//     }

// }

// 1. Default Constructor (No Parameter)

class A {
    int a;
    String b;
    boolean c;

    // A() {
    //     a = 100;
    //     b = "Amit";
    //     c = true;
    // }
    void Disp()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class B
{
    public static void main(String[] args) {
        
    
    A r=new A();
    r.Disp();

}}