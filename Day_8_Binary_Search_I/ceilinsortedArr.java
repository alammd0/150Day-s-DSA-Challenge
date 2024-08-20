package Day_8_Binary_Search_I;

public class ceilinsortedArr {

    public static int ciel(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;
        int ans = arr.length-1;

        while (l <= r) {
            int mid = (l + r) / 2 ;

            if (arr[mid] > x) {
                ans = mid ; 

                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans ;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int x = 5 ;


        System.out.println(ciel(arr, x));
    }
}
