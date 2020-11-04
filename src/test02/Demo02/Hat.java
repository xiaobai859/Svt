package test02.Demo02;

import java.sql.SQLOutput;

/*
1.	定义类：Hat（帽子类）
属性：color（int类型）;price（int类型）;type （String类型）;
提供空参、满参构造，set、get方法
2.	定义接口：Factory（生产帽子类）
抽象方法：void describe(Hat hat);
抽象方法：ArrayList<Hat> piliang(int num);
3.	定义类：FactoryImp（生产帽子类的实现类）
	实现接口Factory：
	重写抽象方法void describe(Hat hat);方法内判断hat的color值，若为奇数是红色，偶数是黄色，并打印该帽子的所有属性（颜色需打印判断后的值：红色/黄色）
	重写抽象方法ArrayList<Hat> piliang(int num)方法内实现：使用for循环生成num个Hat对象，对象的color属性随机赋值，price属性随机生成，范围20-100（包含20和100），type属性赋值为太阳帽

4.	测试类：
1.	创建FactoryImp对象
2.	调用方法ArrayList<Hat> piliang(int num)，批量生产5个帽子并接收
3.	遍历接收的集合，调用方法void describe(Hat hat)打印集合中对象的属性

打印格式如下：
颜色为红色，价格为：78的太阳帽
颜色为红色，价格为：25的太阳帽
颜色为黄色，价格为：46的太阳帽
颜色为红色，价格为：52的太阳帽
颜色为黄色，价格为：90的太阳帽

 */
public class Hat {
    private int color;
    private int price;
    private String type;

    public Hat() {
    }

    public Hat(int color, int price, String type) {
        this.color = color;
        this.price = price;
        this.type = type;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void show() {
        System.out.println(color + "---" + price + "---" + type);
    }

}
