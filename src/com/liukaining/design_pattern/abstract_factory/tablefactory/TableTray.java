package com.liukaining.design_pattern.abstract_factory.tablefactory;

import com.liukaining.design_pattern.abstract_factory.factory.*;


import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("<td>");
        stringBuffer.append("<table width=\"100%\" border=\"1\"><tr>");
        stringBuffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
        stringBuffer.append("</tr>\n");
        stringBuffer.append("<tr>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuffer.append(item.makeHTML());
        }
        stringBuffer.append("</tr></table>");
        stringBuffer.append("</td>");
        return stringBuffer.toString();
    }
}
