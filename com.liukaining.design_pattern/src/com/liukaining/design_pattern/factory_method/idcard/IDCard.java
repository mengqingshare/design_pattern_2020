package com.liukaining.design_pattern.factory_method.idcard;

import com.liukaining.design_pattern.factory_method.framework.*;

public class IDCard extends Product {

    public String getOwner() {
        return owner;
    }

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作 " + owner + " 的 ID 卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的 ID 卡");
    }

}
