public class firstandlast {
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

    public static int[] firstandLast(int arr[], int target) {
        int first = usingBsFirst(arr, target);

        int last = usingBsLast(arr, target);

        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10} ; 

        int target = 8 ;


        int ans[] = firstandLast(arr, target);

        System.out.println(ans[0] + "\n" + ans[1]);
    }
}
