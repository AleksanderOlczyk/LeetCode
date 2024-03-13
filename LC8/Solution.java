package LC8;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;

        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            sign = s.charAt(0) == '+' ? 1 : -1;
            i++;
        }

        long result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + s.charAt(i) - '0';
            if (result * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int) result * sign;
    }
}
