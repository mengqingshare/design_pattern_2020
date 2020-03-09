package com.liukaining.design_pattern.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    /**
     *
     * @return
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
