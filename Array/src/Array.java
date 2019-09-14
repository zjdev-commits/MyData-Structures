public class Array<E>{
    private E[] data;
    private int size;

    public Array(int capacity){
    data = (E[]) new Object[capacity];
    size =0;
    }

    public Array(){
        //this()调用其它方法，必须第一句
        this(10);
    }

    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return data.length;
    }
    public boolean isNull(){
        return size==0;
    }
    public void add(int index,E e){
        if(index<0||index>size) {
            throw new IllegalArgumentException("index取值错误");
        }
        if(size==data.length){
            resize(2*data.length);
        }

        for(int i=size-1;i>=index;i--){
            data[i+1] =data[i];
        }
        data[index]=e;
        size++;
    }
    public void addLast(E e){
        add(size,e);
    }
    public  void addFirst(E e){
        add(0,e);
    }
    public E get(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("参数不符合范围");
        }
        return data[index];
    }
    public void set(int index,E e){
        if(index<0||index>=size){
            throw new IllegalArgumentException("参数不符合范围");
        }
        data[index]=e;
    }
    @Override
    public  String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("size:%d,Capacity:%d[",size,data.length));
        for (int i=0;i<=size-1;i++){
            stringBuilder.append(data[i]);
            if(i!=size-1){
                stringBuilder.append(",");
            }

        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
    public boolean contain(E e){
        for (int i =0 ;i<=size-1;i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    public int find(E e){
        for (int i =0 ;i<=size-1;i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    public E remove(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("参数不符合范围");
        }
        E ret =data[index];
        for(int i=index+1;i<=size-1;i++){
            data[i-1]=data[i];
        }
        size--;
        data[size]=null;
        if(size==data.length/4&&data.length/2!=0){
            resize(data.length/2);
        }
        return ret;
    }
    public  E removeFirst(){
        return remove(0);
    }
    public E removeLast(){
        return remove(size-1);
    }

    public void removeByElement(E e){
        int index = find(e);
        if(index!=-1){
            remove(index);
        }
    }
    public void resize(int newCapacity){
        E[] newArr = (E[])new Object[newCapacity];
        for(int i =0;i<size;i++){
            newArr[i] = data[i];
        }
        data = newArr;
    }

}
