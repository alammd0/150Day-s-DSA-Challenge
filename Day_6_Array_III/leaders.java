package Day_6_Array_III;

import java.util.ArrayList;

public class leaders {

    public static ArrayList<Integer> find(int arr[]) {
        int maxFromRight = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                ans.add(0, maxFromRight);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leaders = find(arr);
        System.out.println("Leaders in the array: " + leaders);
    }
}
