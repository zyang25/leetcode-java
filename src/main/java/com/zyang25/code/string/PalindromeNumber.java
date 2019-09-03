package com.zyang25.code.string;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber app = new PalindromeNumber();

        app.isPalindrome(121);
    }

    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int r = 0;
        int orgX = x;

        // 121
        while (x > 0) {
            int y = x % 10;

            r = r * 10 + y;

            x = x / 10;
        }

        if(r == orgX)
            return true;
        else
            return false;
    }
}
