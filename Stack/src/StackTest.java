public class StackTest {
    public static void main(String[] args) {
   /*     Stack linkedListStack =new LinkedListStack();
        for (int i=0;i<10;i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }
        System.out.println(linkedListStack.peek());
        for (int i=0;i<10;i++) {
            linkedListStack.pop();
            System.out.println(linkedListStack);
        }*/

        Stack linkedListStack =new LinkedListStackDepandent();
        for (int i=0;i<11;i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }
        System.out.println(linkedListStack.peek());
        for (int i=0;i<10;i++) {
            linkedListStack.pop();
            System.out.println(linkedListStack);
        }
    }
}
