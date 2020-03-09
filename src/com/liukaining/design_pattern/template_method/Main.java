package com.liukaining.design_pattern.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay1 = new CharDisplay('H');
        AbstractDisplay abstractDisplay2 = new StringDisplay("Hello LKN");
        AbstractDisplay abstractDisplay3 = new StringDisplay("Hello WaWaWa");
        abstractDisplay1.display();
        abstractDisplay2.display();
        abstractDisplay3.display();
    }
}
