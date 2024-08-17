package Day_5_Array_II;

import java.util.ArrayList;

public class union {

    public static ArrayList<Integer> unionofTwo(int arr1[], int arr2[]) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
           if (!res.contains(arr1[i])) {
                res.add(arr1[i]);
           }
        }

        for (int j = 0; j < arr2.length; j++) {
            if (!res.contains(arr2[j])) {
                res.add(arr2[j]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3, 6, 7 };

        System.out.println(unionofTwo(arr1, arr2));
    }
}
