package Day_6_Array_III;

import java.util.HashMap;
import java.util.Set;

public class majorityElement {

    public static int majority(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }

                if (cnt > nums.length / 2) {
                    return nums[i];
                }
            }
        }

        return -1;
    }

    // using map to solve this question

    public static int usingMap(int nums[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Set<Integer> keySet = map.keySet();

        for (int num : keySet) {
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };

        // System.out.println(majority(nums));
        System.out.println(usingMap(nums));
    }
}
