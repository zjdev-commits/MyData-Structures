//没有设虚拟头节点，在链表头增加、删除一个元素的操作与在其他位置不同
public class RealHeadLinkedList<E> {
    private class Node<E> {
        public E data;
        public Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this(data, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node head;
    private int size;

    public RealHeadLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
       /* Node node = new Node(e);
        node.next = head;
        head = node;*/

        head = new Node(e, head);
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index范围有误");
        }
        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;//prev引用往下走；当i等于索引位置前一个节点位置时，停止循环
            }
  /*          Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;*/
            prev.next = new Node(e, prev.next);
            size++;
        }
    }
    public void addLast(E e){
        add(size,e);
    }
}
