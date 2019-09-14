public class ￥203RemoveLinkedListElements5 {
    public ListNode removeElements(ListNode head, int val) {
        //递归结束条件:head为空
        if(head==null){
            return null;
        }

       head.next = removeElements(head.next,val);
       return head.val==val?head.next:head;
    }
}
