package Revision_Day_1;

import java.util.Scanner;

public class switchCase {


    // 11. program of weekly day find using swith case condition
    public static void weeklyDay(int day){

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thirsday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("Starday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day number");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter the day :");
        int day = sc.nextInt();

        weeklyDay(day);
    }
}
