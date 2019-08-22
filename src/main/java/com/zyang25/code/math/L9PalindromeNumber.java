package com.zyang25.code.math;

public class L9PalindromeNumber {
    public static void main(String[] args) {
        L9PalindromeNumber s = new L9PalindromeNumber();
        System.out.println(s.isPalindrome(121));
        System.out.println(s.isPalindrome(-121));
        System.out.println(s.isPalindrome(20));
    }

    public boolean isPalindrome(int x) {
        int r = 0;
        int orgX = x;

        while(x > 0) {
            int c = x % 10;
            r = r * 10 + c;

            x /= 10;
        }

        return orgX == r;
    }
}
