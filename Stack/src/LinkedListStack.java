public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> linkedList;

    public LinkedListStack() {
        linkedList = new LinkedList();
    }

    @Override
    public void push(E e) {
        linkedList.addHead(e);
    }

    @Override
    public E pop() {
        return  linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public String toString() {
        return "LinkedListStack{" +
                "linkedList=" + linkedList +
                '}';
    }
}
