package com.zyang25.code.linkedlist;

import com.zyang25.model.ListNode;
import com.zyang25.util.ListNodeBuilder;

public class L21MergeTwoSortedLists {
    private static L21MergeTwoSortedLists app = new L21MergeTwoSortedLists();

    public static void main(String[] args) {
        ListNode l1 = ListNodeBuilder.build("-9->3");
        ListNode l2 = ListNodeBuilder.build("5->7");

        app.mergeTwoLists(l1, l2);
    }

    // 1->1->1->1->2->4, 2->3->4
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode r = new ListNode(0);
        ListNode p = r;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                r.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                r.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            r = r.next;
        }

        if(l1 == null) {
            while(l2 != null) {
                r.next = new ListNode(l2.val);
                l2 = l2.next;
                r = r.next;
            }
        }

        if(l2 == null) {
            while(l1 != null) {
                r.next = new ListNode(l1.val);
                l1 = l1.next;
                r = r.next;
            }
        }

        return p.next;
    }


}
