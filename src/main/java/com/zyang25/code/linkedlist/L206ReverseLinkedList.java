package com.zyang25.code.linkedlist;

class L206ReverseLinkedList {
    public static void main(String[] args) {
        L206ReverseLinkedList app = new L206ReverseLinkedList();
        ListNode head = app.new ListNode(1);
        ListNode next1 = app.new ListNode(2);
        ListNode next2 = app.new ListNode(3);

        head.next = next1;
        head.next.next = next2;

        app.reverseList(head);
    }

    public ListNode reverseList(ListNode head) {
        // 1->2->3
        
        ListNode newHead = null;
        while (head != null) {
            ListNode next =  head.next;
            head.next = newHead;
            newHead = head;

            head = next;
        }

        return newHead;
    }

    
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
     
}