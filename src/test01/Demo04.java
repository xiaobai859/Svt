package test01;

import java.util.ArrayList;

/*
第四题（15分）：
定义一个无返回值，参数为String[] 数组的方法，实现以下功能：
1.把数组中的元素存入到一个ArrayList集合中，删除集合中包含字母a的字符串
2.遍历该集合打印剩余元素。
3.在main方法中，定义一个字符串数组
String arr[]={“aafasasf”,”sads1”,”jjww”,”lili”}，
	并将这个字符串数组传入上述方法中，进行测试。
	示例如下：
删除字符串之后的集合元素有：
jjww
	   lili

 */
public class Demo04 {

    public static void main(String[] args) {
        String array[] = {"aafasasf", "sads1", "jjww", "lili"};
        getArray(array);
    }

    public static void getArray(String[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if(list.get(i).charAt(j) == 'a') {
                    list.remove(i--);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
