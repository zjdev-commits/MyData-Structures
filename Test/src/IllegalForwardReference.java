/*深入理解jvm p225
IllegalForwardReference 非法向引用
原因：
类构造器<clinit>()方法会按代码顺序收集所有的类变量的赋值动作以及静态块
* */

public class IllegalForwardReference {
    static {
        i=0;//给后面的静态块变量赋值可以编译
        //System.out.println(i);//访问不可以编译，IllegalForwardReference
    }
    static int i;
    public static void main(String[] args) {

    }
}
