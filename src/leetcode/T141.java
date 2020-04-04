package leetcode;

public class T141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (true){
            if(fast.next == null || fast.next.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
    }
}
