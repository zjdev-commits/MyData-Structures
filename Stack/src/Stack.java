public interface Stack<E> {
    public void push(E e);
    public E pop();
    public E peek();
    public boolean isEmpty();
    public int getSize();
}
