public class lastOccrence {
    public static int lastElement(int arr[], int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int usingBs(int arr[], int target) {
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

    public static void main(String[] args) {
        int array[] = { 2, 2, 3, 3, 3, 3, 4 };
        int x = 3;

        System.out.println(usingBs(array, x));
    }
}
