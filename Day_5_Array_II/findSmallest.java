package Day_5_Array_II;

public class findSmallest {

    public static int find(int arr[]){
        int small = Integer.MAX_VALUE ; 

        for(int i = 0; i < arr.length; i++){
            small = Math.min(small, arr[i]) ;
        }

        return small ; 
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        System.out.println(find(arr));
    }
}
