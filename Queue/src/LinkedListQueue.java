/*
    链队：
    底层：链表 + 队尾索引
    链表第一结点增删：O(1),O(1)作为队首
    链表最后结点增删：O(1),O(N)作为队尾
    不采用虚拟头结点，所以得考虑队null的情况,维护队首、队尾索引：
    因为都是在链表两端进行操作，不需要考虑通过设置虚拟节点，使得对头节点跟剩下结点的操作一致

 */
public class LinkedListQueue<E> implements Queue<E> {
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
    private Node head,tail;
    private int size;
    public LinkedListQueue(){
        head = null;
        tail = null;
        size =0;
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void enqueue(E e) {
        if(tail==null){
            tail = new Node(e);
            head =tail;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalArgumentException("队空了");
        }
        Node ret = head;
        head = head.next;
        ret.next =null;
        //仅剩的最后一个元素被移除的时候,tail仍指向被删哪个节点，所以tail需要维护
    /*
        Node ret = head;//head=tail=ret
        head = head.next;//head=null，tail=ret
        ret.next =null;
      */
     if(head==null){
          tail =head;
      }
         size--;
        return ret.e;
    }

    @Override
    public E getFront() {
        if(isEmpty()){
            throw new IllegalArgumentException("队空了");
        }
        return head.e;
    }
    @Override
    public String toString(){
        Node cur = head;
        StringBuilder sbr =new StringBuilder();
        sbr.append("LinkedListQueue:"+getSize()+"front-->");
        while(cur!=null){
            sbr.append(cur.toString());
            sbr.append("-->");
            cur = cur.next;
        }
        sbr.append("null--tail");
        return sbr.toString();
    }

}
