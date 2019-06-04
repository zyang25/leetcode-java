package com.zyang25.model;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x;}

    public static ListNode create(Integer...nodes){
        if(nodes.length < 1)
            throw new IllegalArgumentException("At least 1 node is expected");

        ListNode head = new ListNode(nodes[0]);
        ListNode temp = head;

        for (int i = 1; i < nodes.length; i++) {
            head.next = new ListNode(nodes[i]);
            head = head.next;
        }
        return temp;
    }
}
