package Day_5_Array_II;

public class moveZero {


    public static void move(int arr[]){
        int left = 0 ; 

        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] != 0) {
                int temp = arr[i] ; 
                arr[i] = arr[left] ;
                arr[left] = temp ; 

                left++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12} ;

        move(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
