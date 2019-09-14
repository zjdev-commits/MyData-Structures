import java.util.Stack;

public class BinarySearchTree<E extends Comparable<E> >  {
    private class Node{
        public E e;
        Node left,right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public  void add(E e){
       root = add(root,e);
    }
    //向根节点为node的树插入新结点e后返回新的以node为根的树
    private Node add(Node node,E e){
        if(node==null){
            size++;
            node = new Node(e);
            return node;
        }
        if(node.e.compareTo(e)>0){
            //  add(node.left,e)直接或间接地接受到下层函数返回的新node;
           node.left = add(node.left,e);
        }else if(node.e.compareTo(e)<0){
            node.right= add(node.right,e);
        }
        return node;
    }
    public boolean contains(E e){
        return contains(root,e);
    }
    private boolean contains(Node node,E e) {
        if (node == null) {
            return false;
        }
        if (node.e.equals(e)) {
            return true;
        } else if (node.e.compareTo(e) > 0) {
           return contains(node.left, e);
        } else {
           return contains(node.right, e);
        }
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void preOrderNR(){
        if(root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.e);
            if(node.right!=null)
            stack.push(node.right);
            if(node.left!=null)
            stack.push(node.left);
        }

    }

    public void inOreder(){
        inOreder(root);
    }
    private void inOreder(Node node){
        if(node==null){
            return;
        }
        inOreder(node.left);
        System.out.println(node.e);
        inOreder(node.right);
    }
    @Override
    public String toString() {
        StringBuilder sbr = new StringBuilder();
        generateBSTString(root,0,sbr);
        return sbr.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder sbr) {
        if(node==null){
            sbr.append(generateDepthString(depth)+"null\n");
            return;
        }
        sbr.append(generateDepthString(depth)+node.e+"\n");
        generateBSTString(node.left, depth+1, sbr);
        generateBSTString(node.right, depth+1, sbr);
    }

    private String generateDepthString(int depth) {
        StringBuilder ret = new StringBuilder();
        for(int i=0;i<depth;i++) {
            ret.append("--");
        }
        return ret.toString();
    }
}
