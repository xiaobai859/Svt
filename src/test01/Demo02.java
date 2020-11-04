package test01;

import java.util.Random;
import java.util.Scanner;

/*
1.定义方法 found(String str)
要求如下:
形参: String str
返回值类型 int
实现:从str中随机获取一个字符，将该字符打印在控制台，并且统计该字符在str中出现的次数
2.在main方法中完成以下要求，从控制台键盘录入一个字符串,调用found(String str)方法，在控制台输出返回的次数
格式如下:
示例1
请输入一个字符串：
abcdefac
随机字符是：f
随机出现的字符次数是：1

示例2
请输入一个字符串：
abcdefac
随机字符是：a
随机出现的字符次数是：2
 */
public class Demo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        int time = found(str);
        System.out.println("随机出现的次数是：" + time);
    }

    public static int found(String str) {
        Random r = new Random();
        int num1 = r.nextInt(str.length());
        char str1 = (str.charAt(num1));

        String str2 = str.replace(Character.toString(str1),"");
        int time = str.length() - str2.length();
        System.out.println("随机字符是：" + str1);
        return time;

    }



}

