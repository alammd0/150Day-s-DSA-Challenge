package Day_1_basic;

import java.util.Scanner;

public class sumofnumberinrange {

    public static int useFormula(int num1, int num2) {
        if (num1 > num2) {
            return 0;
        }

        return ((num2 * (num2 + 1) / 2) - (num1 * (num1 + 1) / 2) + num1);
    }

    public static int useRecursion(int num1, int num2) {
        if (num1 > num2) {
            return 0;
        }

        if (num1 == num2) {
            return num1;
        }

        return num1 + useRecursion(num1 + 1, num2);
    }

    // we try using for loop to solve this question

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number :");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number :");
        int num2 = sc.nextInt();



        System.out.println(useFormula(num1, num2));

        System.out.println(useRecursion(num1, num2));

    }
}
