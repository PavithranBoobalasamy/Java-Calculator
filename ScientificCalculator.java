
public class ScientificCalculator {

    public double sin(double deg) {
        return Math.sin(deg);
    }

    public double cos(double deg2) {
        return Math.cos(deg2);
    }

    public double tan(double deg3) {
        return Math.tan(deg3);
    }

    public double log10(double x1) {
        return Math.log10(x1);
    }

    public double ln(double x2) {
        return Math.log(x2);
    }

    public long factorial(int n) {
        if(n == 1) return 1;
        else{
            return n * factorial(n-1);
        }
    }

    public double abs(double x3) {
        return Math.abs(x3);
    }

    public long mod(int a, int b) {
        return a % b;
    }

}
