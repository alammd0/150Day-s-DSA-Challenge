package Day_3_II_Recursion;

public class minElement {

    public static int getMin(int arr[], int n){
        if (n == 1) {
            return arr[0] ; 
        }


        return Math.min(arr[n-1], getMin(arr, n-1));
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 4, 3}; 

        int n = arr.length ; 

        System.out.println(getMin(arr, n));
    }
}
