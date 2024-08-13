package Day_1_basic;

public class sumNatural {

    public static int sumofNatural(int num) {
        return (num * (num + 1) / 2);
    }

    public static int sumofNatural2(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        return sum;
    }

    public static int useRecursion(int num) {
        if (num == 1) {
            return 1;
        }

        return num + useRecursion(num - 1);
    }

    public static void print(int num) {
        System.out.println(sumofNatural(num));
        System.out.println(sumofNatural2(num));
        System.out.println(useRecursion(num));
    }

    public static void main(String[] args) {
        int n = 5;

        print(n);
    }
}
