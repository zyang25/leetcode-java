package com.zyang25.code.string;


//Example 1:
//
//        Input: "A man, a plan, a canal: Panama"
//        Output: true
public class L125ValidPalindrome {
    public static void main(String[] args) {
        L125ValidPalindrome s = new L125ValidPalindrome();
        System.out.println(s.isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        String ss = s.toLowerCase();

        while(i < j) {

            Character l = ss.charAt(i);
            Character r = ss.charAt(j);

            if(!(Character.isLetter(l) || Character.isDigit(l))) {
                i++;
                continue;
            }

            if(!(Character.isLetter(r) || Character.isDigit(r))) {
                j--;
                continue;
            }

            if(!l.equals(r)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
