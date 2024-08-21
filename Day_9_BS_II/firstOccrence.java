public class firstOccrence {

    public static int firstElement(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                return i ;
            }
        }

        return -1;
    }


    public  static int usingBs(int arr[], int target){
        int left = 0 ;
        int right = arr.length - 1;
        int ans = -1 ;

        while (left <= right) {
            int mid = (left + right) / 2 ;

            if (arr[mid] == target) {
                ans = mid ; 
                
                right = mid - 1 ;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }else{
                right = mid - 1 ;
            }
        }

        return ans ;
    }
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10} ; 

        int target = 8 ;

        System.out.println(usingBs(arr, target));

    }
}
