import com.zyang25.code.linkedlist.L21MergeTwoSortedLists;
import com.zyang25.model.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

class L21MergeTwoSortedListsTest {
    private L21MergeTwoSortedLists app;

    private ListNode l1;

    private ListNode l2;

    @BeforeClass
    void setUp(){
        app = new L21MergeTwoSortedLists();
    }

    // 1->1->1->1->2->4, 2->3->4
    @Test
    void mergeTwoLists() {
        l1 = build("1->1->1->1->2->4");
        l2 = build("2->3->4");
    }

    private ListNode build(String s){
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