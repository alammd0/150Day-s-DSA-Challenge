package Day_3_number;

public class dectobin {
    public static int binary(int N){

    int B_Number = 0; 
    int cnt = 0; 
    while (N != 0)
    { 
        int rem = N % 2; 
        B_Number += rem * Math.pow(10, cnt); 
        N /= 2; 

        cnt++; 
    } 

    return B_Number;
    }
    public static void main(String[] args) {
        int num = 5;

        System.out.println(binary(num));
    }
}
