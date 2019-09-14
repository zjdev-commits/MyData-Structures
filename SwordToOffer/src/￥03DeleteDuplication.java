/*
* 题目描述
在一个排序的链表中，存在重复的结点，
请删除该链表中重复的结点，重复的结点不保留，
返回链表头指针。
 例如，链表1->2->3->3->3->4->4->5 处理后为 1->2->5*/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
    this.val = val;
    }
}
public class ￥03DeleteDuplication{

        public ListNode deleteDuplication(ListNode pHead) {
            ListNode prev = pHead;
            while(prev!=null){
              if(prev.next.val==prev.next.next.val){
                  ListNode node = prev.next.next;
                  while(node.val!=node.next.val){
                      node = node.next;
                  }
                  prev.next=node.next;
              }
              prev = prev.next;
          }
          return pHead;
        }
}
