package Day_3_number;

public class lcm {

    public static int findLCM(int num1, int num2){
        int max = Math.max(num1, num2) ; 

        int mul = num1 * num2 ; 
        int lcm = 0 ;

        for(int i = max; i <= mul; i++){
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i ; 
                break ; 
            }
        }
        return lcm ; 
    }

    public static int findHcf(int num1, int num2) {
        int hcf = 0;

        for (int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static int findlcm2(int num1, int num2){

        int mul = num1 * num2 ; 

        int hcf = findHcf(num1, num2) ; 
        System.out.println(hcf);

        return (mul / hcf) ; 
        
    }
    public static void main(String[] args) {
        int num1 = 12 ;
        int num2 = 14 ; 

        // System.out.println(findLCM(num1, num2));
        System.out.println(findlcm2(num1, num2));
    }
}
