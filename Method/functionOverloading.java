package Method;

public class functionOverloading {

    static float area(int r) {
        return 22 / 7 * r * r;
    }

    static float area(int l,int b){
        return l*b;
    }

    static float area(int a, int b, int c) {
        float s = (float) (a + b + c) / 2.0f;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    

    }

    public static void main(String[] args) {
        int radius = 5;
        int length = 6;
        int width = 7;
        int a = 8, b = 9, c = 3;

        System.out.println("Area of Circle is " + area(radius));
        System.out.println("Area of Rectangle is " + area(length, width));
        System.out.println("Area of Triangle is " + area(a, b, c));
    }

}
