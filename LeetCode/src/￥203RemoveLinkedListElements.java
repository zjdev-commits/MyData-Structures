public class ￥203RemoveLinkedListElements {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

        public ListNode removeElements(ListNode head, int val) {
            //先把第一个结点等于val的情况都删了，让首节点不等于val
            while(head!=null&&head.val==val){
               ListNode ret = head;
               head = head.next;
               ret.next = null;
           }
           //删了第一个结点后，或者原链表 可能为空，
           if(head==null){
                return null;
           }
           //遍历后面的节点
            ListNode prev = head;
            while(prev.next!=null){
                //删除等于val的节点
                if(prev.next.val==val){
                    ListNode ret = prev.next;
                    prev.next = ret.next;
                    ret.next =null;
                    //删掉节点后，不能维护prev，因为不能确保下一个节点不等于val
                }else {
                    prev = prev.next;
                }
            }
            return head;
        }
}
