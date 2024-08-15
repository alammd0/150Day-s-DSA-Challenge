package Day_3_number;

public class bintodecimal {
    public static int decimal(int N){

        int D_Number = 0; 
        int cnt = 0; 
        while (N != 0)
        { 
            int rem = N % 10; 
            D_Number += rem * Math.pow(2, cnt); 
            N /= 10; 
    
            cnt++; 
        } 
    
        return D_Number;
        }
        public static void main(String[] args) {
            int num = 1010;
    
            System.out.println(decimal(num));
        }
}
