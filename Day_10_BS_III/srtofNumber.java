package Day_10_BS_III;

public class srtofNumber {

    public static int solve(int n){
        return (int) Math.floor(Math.sqrt(n));
    }


    public static int usingBS(int n){
        int left = 0 ;
        int right = n ; 

        int val = 0 ;

        while (left < right) {
            int mid = (left + right) / 2 ;

            val = mid * mid ; 

            if (val < n) {
                left = mid + 1;
            }else{
                // ans = mid;

                right = mid - 1;
            }
        }

        return right ;
    }
    public static void main(String[] args) {
        int n = 28; 

        System.out.println(solve(n));
    }
}
