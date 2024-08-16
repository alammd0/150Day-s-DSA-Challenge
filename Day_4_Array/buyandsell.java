package Day_4_Array;

public class buyandsell {

    public static int findMaxprofit(int arr[]) {

        int buyPrice = 0;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < buyPrice) {
                int profit = buyPrice - arr[i];

                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };


        System.out.println(findMaxprofit(arr));
    }
}
