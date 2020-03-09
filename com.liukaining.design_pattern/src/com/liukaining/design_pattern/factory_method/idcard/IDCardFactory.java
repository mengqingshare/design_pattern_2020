package com.liukaining.design_pattern.factory_method.idcard;

import com.liukaining.design_pattern.factory_method.framework.*;

import java.util.*;


public class IDCardFactory extends Factory {

    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    /**
     *
     * @return
     */
    public List getOwners() {
        return owners;
    }
}
