package Day_4_Array;

public class subArray {

    public static void sub(int arr[]) {

        int totalsubArrray = 0;

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = i;

            for (int j = i; j < arr.length; j++) {
                end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    // totalsubArrray++;
                }
                System.out.println();
                totalsubArrray++;
            }
            System.out.println();
        }

        System.out.println("Total : " + totalsubArrray);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };

        sub(arr);
    }
}
