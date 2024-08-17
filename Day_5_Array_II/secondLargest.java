package Day_5_Array_II;

import java.util.Arrays;

public class secondLargest {

    public static int largest(int arr[]){
        Arrays.sort(arr);

        return arr[arr.length-2];
    }

    public static int largest2(int arr[]){

        if (arr.length == 0 || arr.length == 1) {
            return -1;
        }

        int largest = Integer.MIN_VALUE ; 
        int scndLargest = Integer.MIN_VALUE ; 

        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > scndLargest && arr[i] != largest) {
                scndLargest = arr[i];
            }
        }

        return scndLargest ;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 10};

        // System.out.println(largest(arr));

        System.out.println(largest2(arr));
    }
}
