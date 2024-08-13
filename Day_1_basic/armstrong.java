package Day_1_basic;

public class armstrong {

    public static int countDigit(int digit) {
        if (digit == 0) {
            return 0;
        }

        int count = 0;
        while (digit != 0) {
            count++;
            digit = digit / 10;
        }

        return count;
    }

    public static int checkNumber(int number) {
        if (number <= 0) {
            return 0;
        }

        int n = countDigit(number);

        int result = 0;

        while (number != 0) {
            int rem = number % 10;
            result = result + (int) Math.pow(rem, n);
            number = number / 10;
        }

        return result;

    }

    public static boolean armStrong(int number) {

        int rev = checkNumber(number);

        if (rev == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 372;

        // System.out.println(countDigit(num));

        System.out.println(armStrong(num));
    }
}
