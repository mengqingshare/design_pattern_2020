package com.liukaining.design_pattern.visitor;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatementException {
        throw new FileTreatementException();
    }

    public Iterator iterator() throws FileTreatementException {
        throw new FileTreatementException();
    }

    public String toString() {
        return getName() + " (" + getSize() + " )";
    }
}