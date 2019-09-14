public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {

            return e.toString();
        }
    }
    private Node head;
    private int size;
    public LinkedList(){
        head = new Node();
        size=0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void add(int index,E e){
        if(index<0||index>size){
            throw new IllegalArgumentException("index取值有误");
        }
        Node prev = head;
        for(int i=0;i<index;i++){
            prev = prev.next;
        }
/*        Node node = new Node(e);
        node.next =prev.next;
        prev.next = node;*/
        prev.next = new Node(e,prev.next);
        size++;
    }

    public  void addHead(E e){
        add(0,e);
    }
    public void addLast(E e){
        add(size,e);
    }
    public E get(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("index取值有误");
        }
        Node cur = head.next;
        for(int i=0;i<index;i++){
            cur = cur.next;
        }
        E ret = cur.e;
        return ret;
    }
    public E getFirst(){
        return get(0);
    }
    public E getLast(){
        return get(size-1);
    }
    public void set(int index,E e){
        if(index<0||index>=size){
            throw new IllegalArgumentException("index取值有误");
        }
        Node curr = head.next;
        for(int i=0;i<index;i++){
            curr= curr.next;
        }
        curr.e = e;
    }
    public boolean contains(E e){
        Node cur = head.next;
        while(cur!=null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }
    public E remove(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("index取值有误");
        }
        Node pre = head;
        for(int i=0;i<index;i++){
            pre =pre.next;
        }
        Node ret = pre.next;
        pre.next = ret.next;
        ret.next =null;
        size--;
        return ret.e;
    }
    public E removeFirst(){
        return remove(0);
    }
    public E removeLast(){
        return remove(size-1);
    }
    public boolean removeElement(E e){
        Node prev=head;
        while(prev.next!=null){
            if(prev.next.e.equals(e)){
                break;
            }
            prev =prev.next;
        }
        if(prev.next!=null) {
            Node ret = prev.next;
            prev.next = ret.next;
            ret.next = null;
            size--;
            return true;
        }
        return false;
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
