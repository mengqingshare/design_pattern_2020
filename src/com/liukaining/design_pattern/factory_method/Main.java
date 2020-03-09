package com.liukaining.design_pattern.factory_method;

import com.liukaining.design_pattern.factory_method.framework.*;
import com.liukaining.design_pattern.factory_method.idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("LKN");
        Product card2 = factory.create("QFT");
        Product card3 = factory.create("LLLLAAAAA");
        card1.use();
        card2.use();
        card3.use();
    }
}
