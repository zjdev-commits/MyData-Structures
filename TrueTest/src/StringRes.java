/*
* 表达式解析
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
豚厂给自研的数据库设计了一套查询表达式，在这个表达式中括号表示将里面的字符串翻转。请你帮助实现这一逻辑

输入
一行字符串

输出
一行字符串

如果表达式括号不匹配，输出空字符串


样例输入
((ur)oi)
样例输出
iour*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringRes {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        char c,temp;
        for(int i=0;i<expr.length();i++){
            c = expr.charAt(i);
            if(c!=')') {
                stack.add(c);
            }else{
                while (true) {
                    temp = stack.pop();
                    if (temp != '(') {
                        stringBuilder.append(temp);
                    }else{
                        break;
                    }
                }
            }
        }
        if(stack.size()!=0){
            return null;
        }
        return stringBuilder.toString();

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);

    }
}
