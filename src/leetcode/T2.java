package leetcode;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    public ListNode setNext(int v){
        ListNode node = new ListNode(v);
        this.next = node;
        return node;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        ListNode node = this;
        while (node!=null){
            stringBuilder.append(node.val).append("-->");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}


public class T2 {

    public static void main(String[] args){

        ListNode l1 = new ListNode(2);
        l1.setNext(4).setNext(3);
        ListNode l2 = new ListNode(5);
        l2.setNext(6).setNext(4);
        System.out.println(new T2().addTwoNumbers(l1,l2).toString());
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1,l2,0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int flag){
        if(l1 == null && flag == 0){
            return l2;
        }
        if(l2 == null && flag == 0){
            return l1;
        }
        int val1 = l1==null?0:l1.val;
        int val2 = l2==null?0:l2.val;
        int value = val1+val2+flag;
        ListNode node = new ListNode(value%10);
        flag = value/10;
        ListNode node1 = l1==null?null:l1.next;
        ListNode node2 = l2==null?null:l2.next;
        node.next = addTwoNumbers(node1,node2,flag);
        return node;
    }
}
