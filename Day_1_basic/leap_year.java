package Day_1_basic;

import java.util.Scanner;

public class leap_year {

    public static int checkYear(int year) {
        if (year % 4 == 0) {
            return 1;
        }

        if (year % 400 == 0 && year % 100 != 0) {
            return 1;
        }else{
            return 0 ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year :");
        int year = sc.nextInt();

        System.out.println(checkYear(year));
    }
}
