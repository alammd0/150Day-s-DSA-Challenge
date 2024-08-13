package Day_1_basic;

import java.util.Scanner;

public class posandneg {
    public static String checkNumber(int num) {
        if (num < 0) {
            return "Negative number";
        } else if (num > 0) {
            return "Positive number";
        } else {
            return "Number is zero";
        }
    }

    public static void main(String[] args) {
        // int num = 5 ;
        // for user input 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        System.out.println(checkNumber(num));
    }
}
