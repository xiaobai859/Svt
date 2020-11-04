package test01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
第一题（10分）：
1.创建长度为10的int类型数组,并使用随机数(范围2-50包括2和50)为数组赋值，打印数组元素，格式：[元素1,元素2,...]
2.定义findNum方法,传递数组及键盘录入的数据,判断该数据在数组中是否存在,
如果存在,则打印数字在数组中最后一次出现的位置
如果不存在,则打印"不存在",并且不存在只需要提示一次
3.定义方法,统计数组中小于平均值元素的个数,将结果返回并进行输出
 */
public class Demo01Array {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(49) + 2;
        }
        System.out.println("键盘录入一个数据：");
        int num = sc.nextInt();
        findNum(array, num);
        int number = averageLess(array);
        System.out.println("数组中小于平均数的元素个数：" + number);

        System.out.println(Arrays.toString(array));
    }

    public static void findNum(int[] array ,int num) {
        int site = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num) {
                site = i;
                System.out.println(site);
            }
        }
        if(site == -1) {
            System.out.println("不存在");
        }
    }
    public static int averageLess(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < avg) {
                count++;
            }
        }
        return count;
    }
}
