package Day_10_BS_III;

public class Nthroot {

    public static int nth(int n, int m){
        int low = 1 ; 
        int high = m ; 

        while (low <= high) {
            int mid = (low + high) / 2 ; 

            double val = Math.pow(mid, n);

            if (val == m) {
                return mid ; 
            }

            if (val > m) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 4, m= 69 ;

        System.out.println(nth(n, m));
    }
}
