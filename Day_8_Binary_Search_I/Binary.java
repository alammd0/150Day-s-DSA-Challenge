package Day_8_Binary_Search_I;



public class Binary {

    public static int search(int arr[], int targ){

        int l = 0 ; 
        int r = arr.length - 1;
    
        while(l <= r){
            int mid = (l + r) / 2; 
    
            if(arr[mid] == targ){
                return mid ;
            }
    
            if(arr[mid] < targ){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12} ; 

        int targ = 9 ;


        System.out.println(search(arr, targ));
    }
}
