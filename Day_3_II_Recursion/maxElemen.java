package Day_3_II_Recursion;

public class maxElemen {

    public static int getMax(int arr[], int n){
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        return max ;
    }


    public static int getMaxRecur(int arr[], int n){
        if (n == 1) {
            return arr[0];
        }

        // int max = Integer.MIN_VALUE ; 

        return Math.max(arr[n-1], getMaxRecur(arr, n-1));
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1, 5} ; 

        int n = arr.length ; 


        System.out.println(getMaxRecur(arr, n));
    }
}
