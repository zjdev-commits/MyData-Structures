public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] arr  = {5,3,6,8,4,2};
        for(int i:arr){
            bst.add(i);

        }
        bst.preOrder();
        System.out.println("");
        bst.inOreder();
        System.out.println("");
        bst.preOrderNR();
        System.out.println("");
        System.out.println(bst);
    }
}
