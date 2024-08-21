public class searchinRottated_II {

    public static boolean search_II(int arr[], int targ) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (arr[mid] == targ) {
                return true;
            }

            // edage case
            if (arr[first] == arr[mid] && arr[mid] <= arr[last]) {
                first = mid + 1;
                last = mid - 1;
                continue;
            }

            // check case - II
            if (arr[first] <= arr[mid]) {
                // element is present in the first line
                if (arr[first] <= targ && targ <= arr[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
            // case case - III
            else {
                // element is present in the second line
                if (arr[mid] <= targ && targ <= arr[last]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 3;

        System.out.println(search_II(nums, target));
    }
}
