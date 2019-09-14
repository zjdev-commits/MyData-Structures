public class ArrayTest {
    public static void main(String[] args){
        Array<Integer> a = new Array<Integer>(10);
        for(int i=0;i<=8;i++){
            a.add(i,i);
        }
        System.out.println(a.toString());
        a.addFirst(10000);
        System.out.println(a.toString());
        a.set(0,22);
        System.out.println(a.toString());
        a.add(3,33);
          System.out.println(a.toString());
         System.out.println(a.contain(22));
        System.out.println(a.contain(11));
        System.out.println(a.find(22));
        System.out.println(a.find(11));
        a.remove(3);
        System.out.println(a.toString());
        a.removeFirst();
        System.out.println(a.toString());
        a.removeLast();
        System.out.println(a.toString());
        a.removeByElement(1);
        System.out.println(a.toString());

    }
}
