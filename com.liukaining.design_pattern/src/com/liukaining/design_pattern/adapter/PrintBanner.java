package com.liukaining.design_pattern.adapter;

public class PrintBanner extends Banner implements Print {
    /**
     * @param string
     */
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
