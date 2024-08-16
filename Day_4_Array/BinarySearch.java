package Day_4_Array;

public class BinarySearch {

    public static int Search(int arr[], int key) {
        int low = 0;
        int heigh = arr.length-1;

        while (low <= heigh) {
            int mid = (low + heigh) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key > arr[mid]) {
                low = mid + 1;
            } else {
                heigh = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };

        System.out.println(Search(arr, 14));
    }
}
