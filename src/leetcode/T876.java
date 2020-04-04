package leetcode;

public class T876 {
    public ListNode middleNode(ListNode head) {
        if (head ==null || head.next == null){
            return head;
        }
        int n = 0;
        ListNode node = head;
        while (node!=null){
            n++;
            node = node.next;
        }

        for(int i = 0; i < n/2; i++ ){
            head = head.next;
        }
        return head;
    }
}
