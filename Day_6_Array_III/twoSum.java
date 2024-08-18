package Day_6_Array_III;

public class twoSum {

    public static int[] sum(int nums[], int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};   
    }

    // public static int[] sum2(int nums[], int target){
    //     int left = 0;
    //     int right = nums.length-1;

    //     while (left < right) {
    //         int sum = nums[left] + nums[right];

    //         if (sum == target) {
    //             return new int[]{left, right};
    //         }

    //         if (sum > target) {
    //             right--;
    //         }else{
    //             left++;
    //         }
    //     }

    //     return new int[]{};
    // }

    public static void main(String[] args) {
        int nums[] ={3, 2, 4} ;

        int ans[] = sum(nums, 6);

        if (ans.length == 0) {
            System.out.println("Answer is empty");
        }else{
            System.out.println(ans[0] + " " + ans[1]);
        }
       
    }
}