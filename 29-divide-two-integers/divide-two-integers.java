class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long a = dividend;
        long b = divisor;
        int sign = 1;

        if (a < 0) {
            sign = sign * -1;
        }
        if (b < 0) {
            sign = sign * -1;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        int q = 0;
        long temp = 0;

        for (int i = 31; i >= 0; i--) {
            if (temp + (b << i) <= a) {
                temp = temp + (b << i);
                q = q + (1 << i);
            }
        }
        if (sign < 0) {
            q = -q;
        }

        return q;
    }
}
