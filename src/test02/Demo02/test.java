package test02.Demo02;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        FactoryImp impl = new FactoryImp();
        ArrayList<Hat> list = impl.piliang(5);
        for (int i = 0; i < list.size(); i++) {
            impl.describe(list.get(i));
        }

    }
}
