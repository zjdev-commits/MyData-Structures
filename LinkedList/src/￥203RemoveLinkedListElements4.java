/*删除链表中等于给定值 val 的所有节点。

        示例:

        输入: 1->2->6->3->4->5->6, val = 6
        输出: 1->2->3->4->5
        递归：

*/
public class ￥203RemoveLinkedListElements4 {
    //递归语句removeElements（）作用是删除以head为首链表中等于给定值 val 的所有节点,返回处理完的链表
    public ListNode removeElements(ListNode head, int val) {
        //递归结束条件:head为空
        if(head==null){
            return null;
        }
        //从第一个结点开始，把链表分成1 个首结点+ 一个子链表
        //对子链表递归调用
        ListNode ret= removeElements(head.next,val);
        //对当前第一个结点判断是否等于val
        if(head.val==val){
            return ret;
        }else{
            head.next = ret;
            return head;
        }
    }
}
