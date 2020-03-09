package com.liukaining.design_pattern.prototype;

import com.liukaining.design_pattern.prototype.framework.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        Product product1 = manager.create("strong message");
        product1.use("Hello LKN");

        Product product2 = manager.create("warning box");
        product2.use("Hello QFT");

        Product product3 = manager.create("slash box");
        product3.use("Hello LKN,QFT");
    }
}
