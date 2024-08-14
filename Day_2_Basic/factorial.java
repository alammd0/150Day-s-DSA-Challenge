package Day_2_Basic;

public class factorial {

    public static void fact(int n) {
        if (n == 0) {
            return;
        }

        int ans = 1;

        for (int i = n; i > 0; i--) {
            ans *= i;

            System.out.println(ans);
        }
    }

    public static int fact2(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact2(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        fact(n);

        System.out.println(fact2(n));

    }
}
