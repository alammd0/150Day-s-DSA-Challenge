package Day_3_number;

public class hcf {

    public static int findHcf(int num1, int num2) {
        int hcf = 0;

        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        int num1 = 1120;
        int num2 = 1245;

        System.out.println(findHcf(num1, num2));
    }
}
