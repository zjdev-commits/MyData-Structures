import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
     String s1,s2,s3;
/*         s1 = new String("1");    // 同时会生成堆中的对象 以及常量池中1的对象，但是此时s1是指向堆中的对象的
         s2 = s1.intern();            // 常量池中的已经存在
         s3 = "1";
         System.out.println(s1 == s2);    // false
        System.out.println(s1 == s3);   //false
        System.out.println(s3 == s2);   //true*/

/*
        s1 = new String("1") + new String("1");    // 此时生成了四个对象 常量池中的"1" + 2个堆中的"1" + s3指向的堆中的对象（注此时常量池不会生成"11"）
        s2=  s1.intern();    // jdk1.7之后，常量池不仅仅可以存储对象，还可以存储对象的引用，会直接将s2的地址存储在常量池
        s3 = "11";    // jdk1.7之后，常量池中的地址其实就是s3的地址
        System.out.println(s1 == s2);    // ture// jdk1.7之前false， jdk1.7之后true
        System.out.println(s1 == s3);   //ture
        System.out.println(s3 == s2);   //ture*/

       s1 = new String("2") + new String("2");

         s2 = "22";        // 常量池中不存在22，所以会新开辟一个存储22对象的常量池地址
        s3 =s2.intern();    // 常量池22的地址和s3的地址不同
        System.out.println(s1 == s2);    // ｆａｌｓｅ// jdk1.7之前false， jdk1.7之后true
        System.out.println(s1 == s3);   //ｆａｌｓｅ
        System.out.println(s3 == s2);   //ture　*/


    }
}
