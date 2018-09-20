package offer;

public class Question11 {
    public double Power(double base, int exponent) {
        int n = Math.abs(exponent);
        double result = 0.0;
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        result = Power(base, n >> 1);
        result *= result;
        if ((n & 1) == 1) {
            result *= base;
        }
        return (exponent < 0) ? 1 / result : result;
    }
}
