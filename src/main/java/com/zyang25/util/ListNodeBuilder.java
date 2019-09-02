package com.zyang25.util;

import com.zyang25.model.ListNode;

public class ListNodeBuilder {
    public static ListNode build(String s){
        ListNode r = null;

        String[] nodes =  s.split("->");

        for (String node : nodes) {
            int val = Integer.parseInt(node.trim());
            ListNode newNode = new ListNode(val);
            if(r == null)
                r = newNode;
            else
                r.next = newNode;
        }

        return r;
    }
}
