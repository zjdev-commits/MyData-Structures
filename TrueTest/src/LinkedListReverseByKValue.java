/*
题目描述
        给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。

        说明：
        1. 你需要自行定义链表结构，将输入的数据保存到你的链表中；
        2. 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换；
        3. 你的算法只能使用常数的额外空间。
        输入描述:
        第一行输入是链表的值
        第二行输入是K的值，K是大于或等于1的整数

        输入形式为：
        1 2 3 4 5
        2
        输出描述:
        当 k = 2 时，应当输出:
        2 1 4 3 5

        当 k = 3 时，应当输出:
        3 2 1 4 5

        当k=6时，应当输出：
        1 2 3 4 5
        示例1
        输入
        复制
        1 2 3 4 5
        2
        输出
        复制
        2 1 4 3 5
*/

/*
 总结:1、对链表操作时，头结点不要改变，用一个引用指向头结点，把操作链表后的引用赋值给头结点
      2、链表的操作一般都是遍历每个结点，跟结点前后结点有联系，利用结点前后两个引用进行操作
      如:删除:在待删结点的前一个结点 设pre引用 记录待删结点的后一个结点设另一个引用
        反转:在反转的结点设pre引用（默认为空） 记录下一个反转的结点设另一个引用
      3、分治/动态规划+递归

*/


import java.util.Scanner;

public class LinkedListReverseByKValue {
    static class Node{
        int data;
        Node next =null;
        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] sArr = sc.nextLine().split(" ");
        int k = sc.nextInt();
        Node topHeadNode = new Node(-1);
        Node curr = topHeadNode;
        for(int i=0;i<sArr.length;i++){
            Node node = new Node(Integer.parseInt(sArr[i]));
            curr.next=node;
            curr = node;
        }
        curr.next=null;
        Node headNode = topHeadNode.next;
        topHeadNode.next = solution(headNode,k);
        while(topHeadNode.next!=null){
            System.out.println(topHeadNode.next.data);
            topHeadNode = topHeadNode.next;
        }
    }
    //以head为首结点开始每隔K个结点进行反转
    private static Node solution(Node head,int k){
       Node tmp = head;
        for (int i=1;i<k&&tmp!=null;i++)
            tmp = tmp.next;
        if (tmp == null) return head;
        Node Lhead = tmp.next;
        tmp.next = null;
        Node newHead = reverse(head);
        Node newLHead = solution(Lhead, k);
        head.next = newLHead;
        return newHead;
    }

    private static Node reverse(Node head) {
        Node tmp = null, pre = null;
        while (head != null){
            tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        return pre;
    }
}