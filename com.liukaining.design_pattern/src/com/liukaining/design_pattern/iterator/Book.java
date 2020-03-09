package com.liukaining.design_pattern.iterator;

public class Book {
    private String name;

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param name
     */
    public Book(String name) {
        this.name = name;
    }
}
