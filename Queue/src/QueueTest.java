public class QueueTest {
    public static void main(String[] args) {
        Queue arrayQueue = new LinkedListQueue();
        for(int i=0;i<11;i++){
            arrayQueue.enqueue(i);
            System.out.println(arrayQueue.toString());
        }
        System.out.println(arrayQueue.getFront());
        for(int i=0;i<10;i++) {
            arrayQueue.dequeue();
            System.out.println(arrayQueue.toString());
        }

    }
}
