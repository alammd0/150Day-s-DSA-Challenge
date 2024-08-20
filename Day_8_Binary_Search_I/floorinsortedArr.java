package Day_8_Binary_Search_I;

public class floorinsortedArr {

    public static int floor(int arr[], int x){
        int l = 0; 
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= x) {
                ans = mid ;

                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int x = 5 ;

        System.out.println(floor(arr, x));
    }
}
