package Day_1_basic;

public class evenodd {

    public static String checkNumber(int num) {
        if (num % 2 == 0) {
            return "Even Number";
        } else {
            return "odd Number";
        }
    }

    public static void main(String[] args) {
        int num = 3;

        System.out.println(checkNumber(num));
    }
}
