public class LinkedListMap<K,V> implements Map<K,V>{
    private class Node{
        public K key;
        public V value;
        Node next;

        public Node(K key, V value,Node next) {
            this.key = key;
            this.next = next;
        }

        public Node(K key,V value) {
            this(key,null,null);
        }

        public Node() {
            this(null,null,null);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", next=" + next +
                    '}';
        }
    }
    private Node head;
    private int size;
    public LinkedListMap() {
        head = new Node();
        size =0;
    }

    @Override
    public void add(K key, V value) {
        if(getNode(key)==null) {
            Node prev = head;
            head.next = new Node(key, value, head.next);
            size++;
        }
    }

    private Node getNode(K key) {
        Node node = head.next;
        for (int i=0;i<size;i++){
            if(node.key.equals(key)){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public V remove(K key) {

        Node node = head;
        while(node.next!=null){
            if(node.next.key.equals(key)){
                Node delNode = node.next;
                node.next =delNode.next;
                delNode.next =null;
                size--;
                return delNode.value;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key)!=null;
    }

    @Override
    public V get(K key) {
        Node cur = getNode(key);
        if(cur==null){
            throw  new IllegalArgumentException("key不存在");
        }
        return cur.value;
    }

    @Override
    public void set(K key, V newValue) {
        Node cur = getNode(key);
        if(cur==null){
            throw  new IllegalArgumentException("key不存在");
        }
        cur.value = newValue;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
