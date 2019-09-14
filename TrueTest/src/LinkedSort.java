import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
* 链表排序
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
给定一个单向链表和一个整数m，将链表中小于等于m的节点移到大于m的节点之前，要求两部分中的节点各自保持原有的先后顺序

输入
输入数据包含两行，

第一行，整数m

第二行，空格分隔的整数序列

输出
逗号分隔的整数序列


样例输入
4
9 6 3 7 6 5
样例输出
3,9,6,7,6,5*/
public class LinkedSort {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        ListNode curr = head;
        ListNode temp = new ListNode(-1);
        ListNode currTemp = temp;
        ArrayList<Integer> arrayList = new ArrayList();
        while(curr!=null){
            if(curr.val<=m){
                currTemp.next = new ListNode(curr.val);
                currTemp = currTemp.next;
            }else{
                arrayList.add(curr.val);
            }
            curr = curr.next;
        }
        for(int i= 0;i<arrayList.size();i++){
            currTemp.next = new ListNode(arrayList.get(i));
            currTemp = currTemp.next;
        }
        head = temp.next;
        return head;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }

}
