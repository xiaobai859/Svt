package test01;

import java.util.ArrayList;
import java.util.Scanner;

/*
第三题（15分）：
1.定义方法，传递集合ArrayList<String> list，统计集合存储的所有字符串中大写字符总共个数，小写字符总共个数和数字的总共个数，并将统计结果打印。
格式如下：[1234dsd,45gdf,765ser,f425g,t524t]
数字个数：3
小写字符个数：2
大写字符个数：2
2.	在main()方法中完成：
1.	循环录入5个字符串，并存储到集合中
2.	调用方法，传递集合并打印结果

 */
public class Demo03 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.next());
        }
        getList(list);
    }

    public static void getList(ArrayList<String> list) {
        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if('A' <= list.get(i).charAt(j) && list.get(i).charAt(j) <= 'Z') {
                    upperCount++;
                }
                if('a' <= list.get(i).charAt(j) && list.get(i).charAt(j) <= 'z') {
                    lowerCount++;
                }
                if('0' <= list.get(i).charAt(j) && list.get(i).charAt(j) <= '9') {
                    numberCount++;
                }
            }
        }
        System.out.println("数字个数：" + numberCount);
        System.out.println("大写字符个数：" + upperCount);
        System.out.println("小写字符个数：" + lowerCount);
    }
}
