package Day_3_II_Recursion;

public class powN {

    public static int power(int n, int x){
        if (x == 0) {
            return 1;
        }

        return n * power(n, x-1);
    }
    public static void main(String[] args) {
        int n = 5 ; 
        int x = 12 ; 

        System.out.println(power(n, x));
    }
}
