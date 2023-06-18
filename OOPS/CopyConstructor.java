package OOPS;

// /**
//  * CopyConstructor
//  */
// ye construcor kisi dusre construcor ke data ko copy krta hai 
// Refrence ke through kam hoga
class CopyConstructorA {
    int a;
    String b;

    CopyConstructorA() {
        a = 10;
        b = "Amit Thakur";
        System.out.println(a + " " + b);
    }

    CopyConstructorA(CopyConstructorA ref) {
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
}

public class CopyConstructor {

    public static void main(String[] args) {
        CopyConstructorA r = new CopyConstructorA();
        CopyConstructorA r2 = new CopyConstructorA(r);
    }

}