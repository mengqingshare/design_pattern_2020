package com.liukaining.design_pattern.prototype;

import com.liukaining.design_pattern.prototype.framework.*;

public class MessageBox implements Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }


    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        printDecoChar(length);
        System.out.println(decoChar + " " + string + " " + decoChar);
        printDecoChar(length);
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }

    /**
     * @param length
     */
    private void printDecoChar(int length) {
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println(" ");
    }
}
