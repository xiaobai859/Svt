package test01.Demo05;

import java.util.ArrayList;

/*
1.定义Person类, 包含以下成员:
成员属性:
name (姓名)：String类型;     height (身高) ：double类型;      weight (体重) ：int类型，
属性使用private修饰。
成员方法:
1).get/set方法
2).无参无返回值的非静态showBMI()方法, 打印对象的姓名,体重,身高和体质指数:
体质指数=体重÷(身高*身高);
2. 定义Test类：在main()方法中，按以下要求编写代码:
    1） 分别实例化三个Person对象，三个对象分别为："小秋" ,1.72, 72、"小红" ,1.58, 44、"小白" ,1.80, 55;
    2） 创建一个ArrayList集合，这个集合里面存储的是Person类型，分别将上面的三个Person对象添加到集合中
3）遍历这个集合，将集合中姓名为小白的对象，体重增加10kg，然后调用这个对象的showBMI方法展示这个对象的属性和体质指数.
控制台打印示例：
小白身高为1.8米，体重为65公斤，体质指数为21
 */
public class Demo05Test {
    public static void main(String[] args) {
       // Person person = new Person();
        Person p1 =  new Person("小秋",1.72,72);
        Person p2 = new Person("小红", 1.58, 44);
        Person p3 = new Person("小白", 1.80,55);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals("小白")) {
                list.get(i).setWeight(list.get(i).getWeight() + 10);
                list.get(i).showBMI();
            }

        }

    }
}
