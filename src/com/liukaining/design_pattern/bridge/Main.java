package com.liukaining.design_pattern.bridge;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello LKN"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello QFT"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("HelloHello"));
        display1.display();
        display2.display();
        display3.display();
        display3.multiDisplay(5);
    }
}
