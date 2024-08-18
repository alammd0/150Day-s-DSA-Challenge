package Day_6_Array_III;

public class alernateposneg {

    public static void arrang(int nums[]) {

        int pos[] = new int[nums.length / 2];
        int neg[] = new int[nums.length / 2];

        int i = 0;
        int j = 0;

        for (int k = 0; k < nums.length; k++) {

            if (nums[k] > 0) {
                pos[i] = nums[k];
                i++;
            } else {
                neg[j] = nums[k];
                j++;
            }
        }

        for (int k = 0; k < nums.length / 2; k++) {
            nums[2 * k] = pos[k];
            nums[2 * k + 1] = neg[k];
        }

    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };

        // 
        
        arrang(nums);

        for(int i = 0; i < nums.length ; i ++){
            System.out.print(nums[i] + " ");
        }
    }
}
