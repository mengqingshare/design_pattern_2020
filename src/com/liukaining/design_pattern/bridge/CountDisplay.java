package com.liukaining.design_pattern.bridge;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    /**
     *
     * @param times
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
