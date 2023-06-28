package NewOOPSPW;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        int resultNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int resultDenominator = this.denominator * other.denominator;

        return new Fraction(resultNumerator, resultDenominator);
    }

    public void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        Fraction result = f1.add(f2);
        result.simplify();

        System.out.println(f1 + " + " + f2 + " = " + result);
    }
}
