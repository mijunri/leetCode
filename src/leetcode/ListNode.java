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
