package offer;

public class Solution {
    public double Power(double base, int exponent) {
        double result = 1;
        int num;
        for (int i = 1; i <= Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent < 0) {
            return 1 / result;
        } else {
            return result;
        }
    }
    public double Power2(double base, int exponent) {
        int n = Math.abs(exponent);
        double result = 0.0;
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return base;
        }
        result = Power2(base, n >> 1);
        result *= result;
        if ((n & 1) == 1) {
            result *= base;
        }
        return (exponent < 0) ? 1 / result : result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.Power(2, -3);
        solution.Power2(3, 4);
    }
}
