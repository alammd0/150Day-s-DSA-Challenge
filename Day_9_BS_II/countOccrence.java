public class countOccrence {


    // using linear Search
    public static int countValue(int arr[], int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        return count;
    }

    // using Binary Search
    public static int usingBsFirst(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;

                right = mid - 1;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int usingBsLast(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;

                left = mid + 1;
            }

            if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }


    public static int usingBsCount(int arr[], int target){
        int first = usingBsFirst(arr, target) ; 
        int last  = usingBsLast(arr, target) ;

        // System.out.println(first + " " + last);

        // return new int[]{first, last};

        return last - first + 1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 2, 3, 3, 3, 3, 4 };
        int x = 3;

        System.out.println(usingBsCount(array, x));
    }
}
