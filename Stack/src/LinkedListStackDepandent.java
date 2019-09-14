/*
    链栈：
    底层：链表
    链表第一结点增删：O(1),O(1)作为栈顶
    链表最后结点增删：O(1),O(N)作为栈底
 */
public class LinkedListStackDepandent<E> implements Stack<E>{
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }
        public Node(){
        this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    private Node head;
    private int size;
    public LinkedListStackDepandent() {
        head = new Node();
        size=0;
    }
    @Override
    public void push(E e) {
        Node prev = head;
        prev.next = new Node(e,prev.next);
        size++;
    }

    @Override
    public E pop() {
        Node pre = head;
        Node ret = pre.next;
        pre.next = ret.next;
        ret.next =null;
        size--;
        return ret.e;
    }

    @Override
    public E peek() {
        Node cur = head.next;
        E ret = cur.e;
        return ret;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        Node cur = head.next;
        StringBuilder sbr =new StringBuilder();
        sbr.append("LinkedList:"+getSize()+"head-->");
        while(cur!=null){
            sbr.append(cur.toString());
            sbr.append("-->");
            cur = cur.next;
        }
        sbr.append("null");
        return sbr.toString();
    }
}
