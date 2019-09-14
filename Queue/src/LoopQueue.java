//循环队列：底层：静态数组，比动态数组多了两个索引
public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front,tail;
    private int size;
    public LoopQueue(int capacity){
        data = (E[])new Object[capacity+1];
        front=0;
        tail=0;
        size=0;
    }

    public LoopQueue(){
        this(10);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }

    public int getCapacity(){
        return data.length-1;
    }

    @Override
    public void enqueue(E e) {
        if((tail+1)%data.length==front){
            resize(getCapacity()*2);
        }
        data[tail] = e;
        tail = (tail+1)%data.length;
        size++;
    }
    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalArgumentException("队空");
        }
        E ret = data[front];
        data[front]  =null;
        front = (front+1)%data.length;
        size--;
        if(size==getCapacity()/4&&getCapacity()/2!=0){
            resize(getCapacity()/2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if(isEmpty()){
            throw new IllegalArgumentException("队空");
        }
        return data[front];
    }

    public void resize(int capacity){
        E[] newArr = (E[])new Object[capacity+1];
        for(int i=0;i<size;i++){
            newArr[i] = data[(i+front)%data.length];
        }
        data = newArr;
        front =0;
        tail = size;
    }
    @Override
    public String toString(){
        StringBuilder sbr = new StringBuilder();
        sbr.append("Quence:LoopQueue"+size+"/"+getCapacity()+"Front<--[");
        for(int i=front;i!=tail;i=(i+1)%data.length){
            sbr.append(data[i]);
            if((i+1)%data.length!=tail) {
                sbr.append(",");
            }
        }
        sbr.append("]-->Tail");
        return sbr.toString();
    }

}
