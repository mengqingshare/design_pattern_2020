package com.liukaining.design_pattern.template_method;

public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void close();

    public abstract void print();

    /**
     *
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
