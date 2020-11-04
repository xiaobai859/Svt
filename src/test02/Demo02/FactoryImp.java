package test02.Demo02;

import java.util.ArrayList;
import java.util.Random;

public class FactoryImp implements Factory {

    @Override
    public void describe(Hat hat) {
        String color = "";
        if(hat.getColor() % 2 == 1) {
            color = "红色";
        } else
            color = "黄色";
    //    颜色为红色，价格为：78的太阳帽
        System.out.println("颜色为" + color + ",价格为：" + hat.getPrice() + "的" + hat.getType());
    }

    @Override
    public ArrayList<Hat> piliang(int num) {
        ArrayList<Hat> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            Hat hat = new Hat();
            hat.setColor(r.nextInt());
            hat.setPrice(r.nextInt(81) + 20);
            hat.setType("太阳帽");
            list.add(hat);
        }
        return list;


    }
}
