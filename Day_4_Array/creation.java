package Day_4_Array;

import java.util.Scanner;

public class creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt() ; 

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + ",");
        }
    }
}
