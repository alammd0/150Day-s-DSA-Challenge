package Day_1_basic;

public class sumofdigit {

    public static int sumOfdigit(int digit){
        if (digit <= 0) {
            return 0;
        }

        int sum = 0 ;


        while (digit != 0) {
            int rem = digit % 10 ; 
            sum += rem;
            digit = digit / 10;
        }

        return sum;
    }

    public static int userec(int digit, int sum){
        if (digit == 0) {
            return sum;
        }

        int rem = digit % 10;
        sum += rem;
        return userec(digit / 10, sum);

        // return sum ;
    }
    public static void main(String[] args) {
        int n =  786; 

        int sum = 0 ;

        System.out.println(sumOfdigit(n));
        System.out.println(userec(n, sum));
    }
}
