package Day_5_Array_II;

import java.util.HashSet;

public class removeDuplicate {

    public static void removeElement(int arr[]) {
        HashSet<Integer> set = new HashSet<>() ;

        for(int num : arr){
            set.add(num);
        }

        // Iterator it = set.iterator() ; 

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for(int num : set){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };

        removeElement(arr);
    }
}
