/*
* 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
* */
import java.util.HashSet;
import java.util.Stack;

public class ￥02EntryNodeOfLoop {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    /*public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        while (pHead!=null){
            if(!set.contains(pHead)){
                set.add(pHead);
            }else{
                return pHead;
            }
            pHead = pHead.next;
        }
        return null;
    }*/

}

