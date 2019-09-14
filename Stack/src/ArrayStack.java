public class ArrayStack<E> implements Stack<E>{
    private E[] array;
    private int size;
    public ArrayStack(int capacity){
        array =(E[]) new Object[capacity];
    }
    public ArrayStack(){
        this(10);
    }
    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return array.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void push(E e){
        if(size==array.length){
            resize(array.length*2);
        }
        array[size] = e;
        size++;
    }
    public E pop(){
        if(size==0){
            throw  new NullPointerException("栈空");
        }
        E ret=array[size-1];
        array[size-1] = null;
        size--;
        if (size==array.length/4&&array.length/2!=0){
            resize(array.length/2);
        }
        return ret;
    }
    public E peek(){
        return array[size-1];
    }
    @Override
    public String toString(){
        StringBuilder sbr = new StringBuilder();
        sbr.append("Stack:[");
        for(int i=0;i<size;i++){
            sbr.append(array[i]);
            if(i!=size-1) {
                sbr.append(",");
            }
        }
        sbr.append("]-->TOP");
        return sbr.toString();
    }

    public void resize(int newCapa){
        E[] newArr = (E[]) new Object[newCapa];
        for(int i=0;i<size;i++){
            newArr[i] = array[i];
        }
        array = newArr;
    }
}
