package com.liukaining.design_pattern.visitor;

public interface Element {
    public abstract void accept(Visitor visitor);
}
