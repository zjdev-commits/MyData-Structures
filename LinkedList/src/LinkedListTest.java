
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for(int i=0;i<9;i++){
            linkedList.addLast(i);
            System.out.println(linkedList.toString());
        }
        linkedList.add(3,44);
        System.out.println(linkedList.toString());
        linkedList.remove(3);
        System.out.println(linkedList.toString());
        linkedList.removeFirst();
        System.out.println(linkedList.toString());
        linkedList.removeLast();
        System.out.println(linkedList.toString());
        System.out.println(linkedList.removeElement(5));
        System.out.println(linkedList.toString());
        //System.out.println(linkedList.get(8));
    }
}
