public class myPow {

    public static double myPow(double x, int n){
        if (n == 0) 
            return 1;
        int abs = Math.abs(n / 2);
        double half = myPow(x, abs);
        double res;
        if (n % 2 == 0){
            res = half * half;
            System.out.println("We are in the IF; RES is: " + res);
        } else {
            res = x * half * half;
            System.out.println("We are in the ELSE; RES is: " + res);
        }

        if (n > 0){
            return res;
        } else {
            return 1/res;
        }
    }
    public static void main(String[] args){
        int number = 25;
        int exponent = 4;

        System.out.println(number + " to the power of " + exponent + " = " + myPow(number, exponent));
    }
}
