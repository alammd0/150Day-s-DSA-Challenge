package Day_5_Array_II;

public class secondSmallest {

    public static int find(int arr[]){
        int small = Integer.MAX_VALUE ; 

        for(int i = 0; i < arr.length ; i++){
            small = Math.min(small, arr[i]);
        }

        int secondSmall = Integer.MAX_VALUE ; 
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 8, 10, 34, 1};

        System.out.println(find(arr));
    }
}
