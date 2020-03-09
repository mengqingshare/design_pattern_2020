package com.liukaining.design_pattern.builder;

public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String string);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
