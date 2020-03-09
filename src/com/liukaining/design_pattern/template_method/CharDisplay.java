package com.liukaining.design_pattern.template_method;

public class CharDisplay extends AbstractDisplay {
    private char aChar;

    public CharDisplay(char aChar) {
        this.aChar = aChar;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(aChar);
    }
}
