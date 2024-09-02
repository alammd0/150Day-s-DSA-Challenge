package Revision_Day_1;

import java.util.Scanner;

public class condition {

    // 1. check the given character is alphabets or not
    public static void checkCharater(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("Given Charater is alphabets");
        } else {
            System.out.println("Given Charater is not alphabets");
        }
    }

    // 2. check the given number is divisible by 5 and 11
    public static String checkNumber(int num) {
        if (num % 5 == 0 && num % 11 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    // 3. check the given alphabet is vowels and constant 
    public static String checkVowelAndConst(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "alphabets is vowels";
            } else {
                return "alphabets is is consonants";
            }
        } else {
            return "Given character is not a valid";
        }
    }

    // 4. check the given character is alphabet , digit or special character
    public static String checkCharacter(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            return "Given Charater is alphabets";
        } else if (ch >= '0' && ch <= '9') {
            return "Given Charater is Digits";
        } else {
            return "Given Charater is special characters";
        }
    }

    // 5. check the given character is upper and lower case latter 
    public static void checklowerAndUpper(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Given character is small character");
            } else {
                System.out.println("Given character is large character");
            }
        } else {
            System.out.println("Given character is not a valid character");
        }
    }

    // 6. count the notes in given currency note and also given the amount 
    public static void countNotes() {
        int notes500, notes200, notes100, notes50, notes20, notes10, notes5, notes2, notes1;

        notes500 = notes200 = notes100 = notes50 = notes20 = notes10 = notes5 = notes2 = notes1 = 0;

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount >= 500) {

            notes500 = amount / 500;
            amount -= notes500 * 500;

        }
        if (amount >= 200) {

            notes200 = amount / 200;
            amount -= notes200 * 200;

        }
        if (amount >= 100) {

            notes100 = amount / 100;
            amount -= notes100 * 100;

        }
        if (amount >= 50) {

            notes50 = amount / 50;
            amount -= notes50 * 50;

        }
        if (amount >= 20) {

            notes20 = amount / 20;
            amount -= notes20 * 20;

        }
        if (amount >= 10) {

            notes10 = amount / 10;
            amount -= notes10 * 10;

        }
        if (amount >= 5) {

            notes5 = amount / 5;
            amount -= notes5 * 5;

        }
        if (amount >= 2) {

            notes2 = amount / 2;
            amount -= notes2 * 2;

        }
        if (amount >= 1) {

            notes1 = amount;

        }

        System.out.println(notes500);
        System.out.println(notes200);
        System.out.println(notes100);
        System.out.println(notes50);
        System.out.println(notes20);
        System.out.println(notes10);
        System.out.println(notes5);
        System.out.println(notes2);
        System.out.println(notes1);
    }


    // 7. check the valid Triangle 
    public static void checkValidTringangle(int angle1, int angle2, int angle3) {

        int sum = angle1 + angle2 + angle3;

        if (sum == 180) {
            System.out.println("Given angle are valid for triangleangle conditions");
        } else {
            System.out.println("Given angle are invalid for triangleangle conditions");
        }
    }

    // 8. check the triangle (equalater, scalene and isoscelence)
    public static void checktringle(int side1, int side2, int side3) {

        if (side1 == side2 && side1 == side3) {
            System.out.println("This triangle is equalater");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This triangle is scalene");
        } else {
            System.out.println("this triangle is isoscelence");
        }
    }

    // 9. profit loss question 
    public static void profitAndLoss(int sp, int cp) {

        int profit = 0;

        int loss = 0;

        if (sp > cp) {
            profit = sp - cp;

            System.out.println("profit is = " + profit);
        } else {

            loss = cp - sp;

            System.out.println("loss is = " + loss);
        }
    }

    // 10. calculate the percentage and give the grade accordind the codition
    public static void calculatePercentage() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of first Sub : ");
        int sub1 = sc.nextInt();

        System.out.println("Enter the marks of 2nd Sub : ");
        int sub2 = sc.nextInt();

        System.out.println("Enter the marks of 3rd Sub : ");
        int sub3 = sc.nextInt();

        System.out.println("Enter the marks of 4rth Sub : ");
        int sub4 = sc.nextInt();

        System.out.println("Enter the marks of fift Sub : ");
        int sub5 = sc.nextInt();

        int percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        if (percentage >= 90) {
            System.out.println("Garade A");
        } else if (percentage >= 80) {
            System.out.println("Garade B");
        } else if (percentage >= 70) {
            System.out.println("Garade C");
        } else if (percentage >= 60) {
            System.out.println("Garade D");
        } else if (percentage >= 40) {
            System.out.println("Garade E");
        } else {
            System.out.println("Grade F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the first Number : ");
        // int a = sc.nextInt() ;

        // System.out.println(checkNumber(b));

        // countNotes(b);

        // countNotes();

        // if (a > b) {
        // System.out.println("A is maximum ");
        // }else{
        // System.out.println("B is Maximum");
        // }

        // System.out.println("Enter the character : ");
        // char ch = sc.next().charAt(0);

        // checklowerAndUpper(ch);

        // System.out.println(checkVowelAndConst(ch));

        // System.out.println(checkCharacter(ch));

        // System.out.println(checkVowelAndConst(ch));

        // checkCharater(ch);5

        // System.out.println("Ente the Angle1 : ");
        // int angle1 = sc.nextInt();

        // System.out.println("Enter the Angle2 : ");
        // int angle2 = sc.nextInt();

        // System.out.println("Enter the Angle3 : ");
        // int angle3 = sc.nextInt();

        // // checkValidTringangle(angle1, angle2, angle3);

        // checktringle(angle1, angle2, angle3);

        // System.out.println("Enter the selling price is = ");
        // int sp = sc.nextInt();

        // System.out.println("Enter the cost price is = ");
        // int cp = sc.nextInt();
        // profitAndLoss(sp, cp);\

        calculatePercentage();
    }
}
