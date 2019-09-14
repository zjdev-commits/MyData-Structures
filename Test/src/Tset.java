
import java.util.*;
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
class reverseKlist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] str = sc.nextLine().split(" ");
            int k = Integer.valueOf(sc.nextLine());
            ListNode pre = new ListNode(Integer.valueOf(str[0]));
            ListNode head = pre;
            for (int i=1;i<str.length;i++){
                ListNode node = new ListNode(Integer.valueOf(str[i]));
                pre.next = node;
                pre = node;
            }
            pre.next = null;
            head = reverse(head, k);
            while (head != null){
                System.out.print(head.val+" ");
                head = head.next;
            }
        }
    }
    public static ListNode reverse(ListNode head, int k){
        ListNode tmp = head;
        for (int i=1;i<k&&tmp!=null;i++)
            tmp = tmp.next;
        if (tmp == null) return head;
        ListNode Lhead = tmp.next;
        tmp.next = null;
        ListNode newHead = revK(head);
        ListNode newLHead = reverse(Lhead, k);
        head.next = newLHead;
        return newHead;
    }
    public static ListNode revK(ListNode head){
        ListNode tmp = null, pre = null;
        while (head != null){
            tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
}
