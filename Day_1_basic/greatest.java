package Day_1_basic;

import java.util.Scanner;

public class greatest {
    // two and three Number in java

    public static String checkGreates(int a, int b) {
        if (a > b) {
            return "a is greater Number";
        } else {
            return "b is greater Number";
        }
    }

    public static String checkGreaters(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return "a is greater Number";
            } else {
                return "b is greater Number";
            }
        } else {
            if (b > c) {
                return "b is greater Number";
            } else {
                return "c is greater Number";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number :");
        int a = sc.nextInt();

        System.out.println("Enter the second Number :");
        int b = sc.nextInt();

        System.out.println("Enter the third Number :");
        int c = sc.nextInt();

        System.out.println(checkGreaters(a, b, c));

        System.out.println(checkGreates(a, b));
    }
}
