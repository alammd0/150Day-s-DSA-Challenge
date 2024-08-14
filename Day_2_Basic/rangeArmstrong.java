package Day_2_Basic;

public class rangeArmstrong {

    public static int count(int n) {

        if (n <= 0) {
            return 0;
        }

        int cnt = 0;

        while (n != 0) {
            cnt++;
            n = n / 10;
        }

        return cnt;
    }

    public static int checkNumber(int number) {
        if (number == 0) {
            return 0;
        }

        int n = count(number);

        int result = 0;

        while (number != 0) {
            int rem = number % 10;
            result = result + (int) Math.pow(rem, n);
            number = number / 10;
        }

        return result;
    }

    public static void rangeArm(int num1, int num2) {
        if (num2 == 0) {
            // return 0 ;
            return;
        }

        for (int i = num1; i <= num2; i++) {

            if (i == checkNumber(i)) {
                System.out.println("Armstrong Number is " + i);
            }
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 1000;

        rangeArm(num1, num2);
    }
}
