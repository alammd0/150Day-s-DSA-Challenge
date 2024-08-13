package Day_1_basic;

public class prime_Number {

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            return true;
        } else {
            return false;
        }
    }


    public static void printRangeprime(int num1, int num2){
        if (num1 > num2) {
            return;
        }

        for(int i = num1; i <= num2; i++){
            if (checkPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

    
    public static void main(String[] args) {
        int num1 = 1;

        int num2 = 20 ; 

        printRangeprime(num1, num2);

        // System.out.println(checkPrime(num));
    }
}
