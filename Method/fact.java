package Method;

public class fact {

    static int factt(int n) {

        // if (n == 1) {
        //     return 1;
        // }

        // else {
        //     return n * factt(n - 1);
        // }
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    

    public static void main(String[] args) {
        System.out.println(factt(10));
    }
}
