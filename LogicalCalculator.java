
public class LogicalCalculator {

    public long bitwiseAND(long num1, long num2) {
        return num1 & num2;
    }

    public long bitwiseOR(long num1, long num2) {
        return num1 | num2;
    }

    public long bitwiseNOT(long num) {
        return ~num;
    }

    public long XOR(long num1, long num2) {
        return num1^num2;
    }

    public long XNOR(long num1, long num2) {
        return ~(num1 ^ num2);
    }
}
