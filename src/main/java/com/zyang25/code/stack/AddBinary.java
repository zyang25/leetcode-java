package com.zyang25.code.stack;

import java.util.Stack;

public class AddBinary {
    public static void main(String[] args) {
        AddBinary app = new AddBinary();
        app.addBinary("0", "0");
    }

    public String addBinary(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        int x = a1.length - 1;
        int y = b1.length - 1;

        Stack<Integer> tracker = new Stack();

        while (x >=0 || y >= 0) {
            int carr = tracker.size() > 0 ? tracker.pop() : 0;
            int l = x >= 0 ? toInt(a1[x]) : 0;
            int r = y >= 0 ? toInt(b1[y]) : 0;

            int total = l + r + carr;
            carr = total / 2;
            total = total % 2;

            tracker.push(total);
            tracker.push(carr);

            x--;
            y--;
        }

        String result = "";
        int c = 1;
        while (tracker.size() > 0) {
            int v = tracker.pop();

            if(c == 1 && v == 0 && tracker.size() > 0)
                continue;

            result += String.valueOf(v);
            c++;
        }

        return result;
    }

    private Integer toInt(char c){
        return Character.getNumericValue(c);
    }
}
