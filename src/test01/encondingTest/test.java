package test01.encondingTest;

import java.nio.charset.Charset;

public class test {

    public static void main(String[] args) {

        System.out.println(System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset().name());
    }

}
