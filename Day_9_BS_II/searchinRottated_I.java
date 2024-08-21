public class searchinRottated_I {

    public static int searchElement(int arr[], int x) {
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            // find the mid

            int mid = (first + last) / 2;

            // check case - I
            if (arr[mid] == x) {
                return mid;
            }

            // check case - II
            if (arr[first] <= arr[mid]) {
                // element is present in the first line
                if (arr[first] <= x && x <= arr[mid]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
            // case case - III
            else {
                // element is present in the second line
                if (arr[mid] <= x && x <= arr[last]) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,0,0,1,2};
        int targ = 0;

        System.out.println(searchElement(arr, targ));
    }
}
