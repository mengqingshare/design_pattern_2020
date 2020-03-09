package com.liukaining.design_pattern.abstract_factory.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    /**
     *
     * @param item
     */
    public void add(Item item) {
        tray.add(item);
    }
}
