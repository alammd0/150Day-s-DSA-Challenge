package Day_7_Array_IV;

import java.util.Arrays;
import java.util.HashSet;

public class longextSub {

    public static boolean linear(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int longest(int arr[]) {
        int n = arr.length;

        int longest = 1;

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int cnt = 1;

            while (linear(arr, x + 1) == true) {
                x = x + 1;
                cnt = cnt + 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int longest2(int arr[]) {

        Arrays.sort(arr);

        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int cnt = 0;
        int longest = 1;
        int smaller = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == smaller) {
                cnt += 1;
                smaller = arr[i];
            } else if (arr[i] != smaller) {
                cnt = 0;
                smaller = arr[i];
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int longest3(int arr[]) {
        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int longest = 1;
        HashSet<Integer> s = new HashSet<>();

        for (int num : arr) {
            s.add(num);
        }

        for (int num : s) {
            if (!s.contains(num - 1)) {
                int cnt = 1;
                int x = num;

                while (s.contains(x + 1)) {
                    x = x + 1;
                    cnt += 1;
                }

                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };

        System.out.println(longest3(arr));
    }
}
