package Day_8_Binary_Search_I;

public class Floorandceil {


    public static int floor(int arr[], int x){
        int l = 0; 
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid] ;

                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans ;
    }


    public static int ciel(int arr[], int x){
        int l = 0;
        int r = arr.length - 1;
        int ans = arr.length-1;

        while (l <= r) {
            int mid = (l + r) / 2 ;

            if (arr[mid] > x) {
                ans = arr[mid] ; 

                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans ;
    }

    public static int[] floorceil(int arr[], int x){

        int floor = floor(arr, x);

        int ceil = ciel(arr, x) ; 

        return new int[]{floor, ceil};

    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10};

        int ans[] = floorceil(arr, 5);


        System.out.println(ans[0] + "," + ans[1]);
    }
}