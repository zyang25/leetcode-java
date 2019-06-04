package com.zyang25.code.linkedlist;

import com.zyang25.model.ListNode;

public class L2AddTwoNumbers {
    public static void main(String[] args) {
        L2AddTwoNumbers s = new L2AddTwoNumbers();

        ListNode l1 = ListNode.create(1, 8);
        ListNode l2 = ListNode.create(0);

        s.addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer remain;
        Integer nextPlus = 0;
        ListNode newNode = new ListNode(0);
        ListNode dummy = newNode;
        while (l1 != null || l2 != null) {
            int num = l1.val + l2.val + nextPlus;
            remain = num % 10;

            if(num / 10 == 1) {
                nextPlus = 1;
                newNode.next = new ListNode(remain);
            }else {
                newNode.next = new ListNode(remain);
                nextPlus = 0;
            }

            if(l1.next == null && l2.next != null)
                l1.next = new ListNode(0);
            else if(l1.next != null && l2.next == null)
                l2.next = new ListNode(0);

            newNode = newNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(nextPlus != 0)
            newNode.next = new ListNode(nextPlus);

        // delete the first dummy note
        dummy = dummy.next;

        return dummy;
    }

    private ListNode reverse(ListNode l1) {
        ListNode prev = null;
        while(l1 != null) {
            ListNode nextTemp = l1.next;
            l1.next = prev;
            prev = l1;

            l1 = nextTemp;
        }
        return prev;
    }
}