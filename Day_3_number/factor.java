package Day_3_number;

public class factor {

    public static void findFactor(int num1) {
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int num1 = 14;

        findFactor(num1);
    }
}