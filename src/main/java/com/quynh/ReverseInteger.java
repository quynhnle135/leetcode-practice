package com.quynh;

public class ReverseInteger {
    public static int reverseInteger(int num) {
        int reversed = 0;
        int lastDigit = 0;
        while (num != 0) {
            lastDigit = num % 10;
            num /= 10;

            if (reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && lastDigit > 7) return 0;
            if (reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && lastDigit < -8) return 0;

            reversed = (reversed * 10) + lastDigit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(-12));
    }
}
