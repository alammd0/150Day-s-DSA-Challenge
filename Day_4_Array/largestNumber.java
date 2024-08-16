package Day_4_Array;

public class largestNumber {

    public static int findLar(int arr[]){
        int largest = Integer.MIN_VALUE ; 

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i] ;
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 5 , 6, 3} ; 

        System.out.println(findLar(arr));
    }
}
