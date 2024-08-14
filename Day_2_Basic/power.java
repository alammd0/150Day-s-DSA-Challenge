package Day_2_Basic;

public class power {

    public static int power(int x, int y){
        
        return (int) Math.pow(x, y);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 3 ;

        System.out.println(power(x, y));
    }
}
