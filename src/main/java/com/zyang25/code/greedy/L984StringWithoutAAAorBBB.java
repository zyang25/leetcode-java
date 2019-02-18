package com.zyang25.code.greedy;

class L984StringWithoutAAAorBBB {
    public static void main(String[] args) {
        L984StringWithoutAAAorBBB app = new L984StringWithoutAAAorBBB();
        System.out.println(app.strWithout3a3b(4, 1));
    }

    public String strWithout3a3b(int A, int B) {
        String r = "";
        String str1 = "a";
        String str2 = "b";

        if(A < B) {
            int tmp = A;
            A = B;
            B = tmp;
            str1 = "b";
            str2 = "a";
        }

        while( A > 0 || B > 0){
            if(A > 0) { r += str1; A--;}
            if(A > B) { r += str1; A--;}
            if(B > 0) { r += str2; B--;}
        }
        return r;
    }
}