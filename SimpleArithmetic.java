
public class SimpleArithmetic {

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public long integerDivide(long num1, long num2) {
        return num1/num2;
    }

    public long divide(long num1, long num2) {
        return (long)((float)num1/num2);
    }

    public long sqRoot(long num) {
        long guess = num/2;
        double eps = 0.00001;
        while((guess*guess)-num > eps){
            guess = (guess + num/guess) /2;
        }
        return guess;
    }

    public double exponentiation(long num1, long num2) {
        if(num2<0){
            num1 = 1/num1;
            num2 = -num2;
        }
        return power(num1,num2);
    }

    private double power(long num1,long num2){
        if(num2 == 0) return 1;
        double half = power(num1, num2/2);
        double result = half  * half;
        if(num2%2 == 1) result *=num1;
        return result;
    }

}
