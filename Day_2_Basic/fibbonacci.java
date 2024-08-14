package Day_2_Basic;

import Day_1_basic.reverse_Number;

public class fibbonacci {

    public static void printFibb(int n){
        int a = 0, b = 1;

        int nextterm;


        System.out.print(a + " " + b + " ");

        for(int i = 2; i <= n; i++){
            nextterm = a + b ; 
            a = b ;
            b = nextterm ; 

            System.out.print(nextterm+ " ");
        }
    }


    public static int nthfibb(int n){
        if (n == 0 || n == 1) {
            return n ;
        }

        return nthfibb(n-1) + nthfibb(n-2);
    }
    public static void main(String[] args) {
        int n = 5 ;

        printFibb(n);

        System.out.println(nthfibb(n));
    }
}
