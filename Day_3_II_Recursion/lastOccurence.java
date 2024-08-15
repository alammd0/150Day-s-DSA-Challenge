package Day_3_II_Recursion;

public class lastOccurence {

    public static int findLastOccurrence(int arr[], int idx, int key) {
        // Base case: if index is out of bounds, return -1
        if (idx >= arr.length) {
            return -1;
        }

        // Recursive call to check the rest of the array
        int isFound = findLastOccurrence(arr, idx + 1, key);

        // If key is found in the future, return that index
        if (isFound != -1) {
            return isFound;
        }

        // Otherwise, check the current index
        if (arr[idx] == key) {
            return idx;
        }

        // If key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;

        System.out.println(findLastOccurrence(arr, 0, key));
    }
}
