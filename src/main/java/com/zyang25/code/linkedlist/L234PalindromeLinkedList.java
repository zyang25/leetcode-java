package com.zyang25.code.linkedlist;

import com.zyang25.model.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class L234PalindromeLinkedList {
    public static void main(String[] args) {
        L234PalindromeLinkedList app = new L234PalindromeLinkedList();

        ListNode head = ListNode.create(1, 0, 1);

        app.isPalindrome(head);
    }

    public boolean isPalindromeFast(ListNode head) {
        //reverse the 2nd part??

        return true;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode newHead = new ListNode(head.val);

        while (head.next != null) {
            ListNode n = new ListNode(head.next.val);
            n.next = newHead;
            newHead = n;
            head = head.next;
        }

        while (newHead != null) {
            if(temp == null)
                return false;
            else if(temp.val != newHead.val)
                return false;

            newHead = newHead.next;
            temp = temp.next;
        }

        return true;
    }
}