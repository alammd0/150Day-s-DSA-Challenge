package Day_4_Array;

public class maxSubArray {

    public static int maxSub(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = i; j < arr.length; j++) {
                end = j;
                currSum = 0;

                for (int k = start; k < end; k++) {
                    currSum += arr[k];
                    // System.out.println(currSum);


                    // System.out.print(currSum + " ");
                    maxSum = Math.max(currSum, maxSum);
                }
                System.out.println();
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(maxSub(arr));
    }
}
