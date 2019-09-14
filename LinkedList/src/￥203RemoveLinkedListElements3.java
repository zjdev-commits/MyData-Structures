public class ￥203RemoveLinkedListElements3 {
    public ListNode removeElements(ListNode head, int val) {
       ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while(prev.next!=null){
            if(prev.next.val==val){
                prev.next=prev.next.next;
            }else {
                prev =prev.next;
            }
        }
        //这里不能是head，因为可能这个结点已经被删除了
        return dummyHead.next;
    }
}
