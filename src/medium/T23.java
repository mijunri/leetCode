package medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0){
            return null;
        }

        int len = lists.length;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(len, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for(int i = 0; i < len ; i++){
            if(lists[i]!=null){
                priorityQueue.add(lists[i]);
            }
        }
        ListNode pre = new ListNode(-1);
        ListNode current = pre;
        while (!priorityQueue.isEmpty()){
            ListNode node = priorityQueue.remove();
            current.next = new ListNode(node.val);
            current = current.next;
            if(node.next!=null){
                priorityQueue.add(node.next);
            }
        }
        return pre.next;
    }
}
