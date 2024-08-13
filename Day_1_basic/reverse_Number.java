package Day_1_basic;

public class reverse_Number {

    public static int reverseNumber(int n) {
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
        if (n <= 0) {
            return rev ;
        }
        
        int rem = n % 10 ;
        rev = rev * 10 + rem ; 
        return useRec(n / 10, rev);

    }

    public static void main(String[] args) {
        int n = 1234;

        int rev = 0;

        // System.out.println(reverseNumber(n));\

        System.out.println(useRec(n, rev));
    }
}
