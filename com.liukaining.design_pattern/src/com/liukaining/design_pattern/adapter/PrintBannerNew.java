package com.liukaining.design_pattern.adapter;

public class PrintBannerNew extends PrintNew {
    private Banner banner;

    /**
     * @param string
     */
    public PrintBannerNew(String string) {
        this.banner =  new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
