package Day_1_basic;

public class palindrome {
    public static int reverse(int n) {
        if (n <= 0) {
            return 0;
        }

        int rev = 0;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev;
    }

    public static int useRec(int n, int rev){
        if (n == 0) {
            return rev;
        }

        int rem = n % 10 ; 
        rev = rev * 10 + rem ; 

        return useRec(n/10, rev);
    }

    public static boolean checkNumber(int n) {

        int rev = 0;
        // int reverse = reverse(n);

        int reverse = useRec(n, rev);

        if (reverse == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 121;

        System.out.println(checkNumber(n));
    }
}
