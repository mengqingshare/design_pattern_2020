package com.liukaining.design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start!");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println("obj1: " + obj1.hashCode());
        System.out.println("obj2: " + obj2.hashCode());
        System.out.println();
        if (obj1 == obj2) {
            System.out.println("相同实例");
        } else {
            System.out.println("不同实例");
        }

        System.out.println("End");
    }
}
