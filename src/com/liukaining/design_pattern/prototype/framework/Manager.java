package com.liukaining.design_pattern.prototype.framework;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    /**
     * @param name
     * @param proto
     */
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    /**
     * @param protoName
     * @return
     */
    public Product create(String protoName) {
        Product product = (Product) showcase.get(protoName);
        return product;
    }
}
