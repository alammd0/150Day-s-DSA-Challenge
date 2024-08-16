package Day_4_Array;

public class Pairs {

    public static void findPair(int arr[]){

        int countPairs = 0 ;

        for(int i = 0; i < arr.length; i++){
            int curr = arr[i] ; 

            for(int j = i + 1; j < arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                countPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :" + countPairs);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10} ;

        findPair(arr);
    }
}
