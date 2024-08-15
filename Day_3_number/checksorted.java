package Day_3_number;

public class checksorted {

    public  static boolean Sorted(int i, int arr[]){
        if (i == arr.length - 1) {
            return true ;
        }

        if (arr[i] >= arr[i+1]) {
            return false ;
        }

        return Sorted(i+1, arr);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4};

        System.out.println(Sorted(0, arr));
    }
}
