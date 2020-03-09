package com.liukaining.design_pattern.adapter;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeek();
        print.printStrong();

        PrintNew printNew = new PrintBannerNew("HelloNew");
        printNew.printStrong();
        printNew.printWeek();
    }
}
