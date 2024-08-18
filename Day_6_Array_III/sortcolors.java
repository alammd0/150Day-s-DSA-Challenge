package Day_6_Array_III;

public class sortcolors {

    public static void sortThecolors(int num[]) {
        int cntZero = 0;
        int cntOne = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                cntZero++;
            } else if (num[i] == 1) {
                cntOne++;
            }
        }

        for (int i = 0; i < cntZero; i++) {
            num[i] = 0;
        }

        for (int j = cntZero; j < cntZero + cntOne; j++) {
            num[j] = 1;
        }

        for (int k = cntZero + cntOne; k < num.length; k++) {
            num[k] = 2;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };

        sortThecolors(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }

    }
}
