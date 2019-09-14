//队列：底层：动态数组，需要维护第一元素是队首，最后元素为队尾
public class ArrayQueue<E> implements Queue<E>{
    private E[] array;
    private int size;

    public ArrayQueue(int capacity) {
        array = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        this(10);
    }
    @Override
    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return array.length;
    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public void enqueue(E e){
        if(size==array.length){
            resize(array.length*2);
        }
        array[size] = e;
        size++;
    }
    @Override
    public E dequeue(){
        if (size==0){
            throw new NullPointerException("队空");
        }
        E e = array[0];
        for(int i=1;i<size;i++){
            array[i] = array[i-1];
        }
        array[size-1] = null;
        size--;
        if(size == array.length/4){
            resize(array.length/2);
        }
       return e;
    }
    @Override
    public E getFront(){
        return array[0];
    }
    @Override
        public String toString(){
            StringBuilder sbr = new StringBuilder();
            sbr.append("Quence:ArrayQueue"+size+"/"+array.length+"Front<--[");
            for(int i=0;i<size;i++){
                sbr.append(array[i]);
                if(i!=size-1) {
                    sbr.append(",");
                }
            }
            sbr.append("]-->Tail");
            return sbr.toString();
        }

    private void resize(int newCapa) {
        E[] newArr =(E[]) new Object[newCapa];
        for(int i=0;i<size;i++){
            newArr[i]=array[i];
        }
        array = newArr;
    }



}