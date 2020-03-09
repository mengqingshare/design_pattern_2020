package com.liukaining.design_pattern.abstract_factory.listfactory;

import com.liukaining.design_pattern.abstract_factory.factory.*;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<li>\n");
        stringBuffer.append(caption + "\n");
        stringBuffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuffer.append(item.makeHTML());
        }

        stringBuffer.append("</ul>\n");
        stringBuffer.append("</li>\n");

        return stringBuffer.toString();
    }
}
