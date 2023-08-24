package Method;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 23;
        boolean flag = true;

        if (num <= 1) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Number is Prime");
        } else {   
            System.out.println("Number is not Prime");
        }
    }
}
