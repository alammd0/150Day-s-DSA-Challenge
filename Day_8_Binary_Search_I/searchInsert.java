package Day_8_Binary_Search_I;

public class searchInsert {

    public static int insert(int arr[], int x) {

        // int ans = arr.length ;

        // for(int i = 0; i < arr.length; i++){
        // if (arr[i] >= x) {
        // return i ;
        // }
        // }

        // return arr.length;

        // using Binary Search

        int l = 0;
        int r = arr.length-1;
        int ans = arr.length;

        while (l <= r) {
            int mid = (l + r) / 2 ;


            if (arr[mid] >= x) {
                ans = mid ; 

                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 2;

        System.out.println(arr.length);

        System.out.println(insert(arr, target));
    }
}
