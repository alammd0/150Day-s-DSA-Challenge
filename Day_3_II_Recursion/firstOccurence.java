package Day_3_II_Recursion;

public class firstOccurence {

    public static int firstOcc(int arr[], int idx, int key) {
        if (idx == arr.length - 1) {
            return -1;
        }

        if (arr[idx] == key) {
            return idx;
        } 

        return firstOcc(arr, idx + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };

        System.out.println(firstOcc(arr, 0, 5));
    }
}
