package com.liukaining.design_pattern.abstract_factory.tablefactory;

import com.liukaining.design_pattern.abstract_factory.factory.*;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("<html><head><title>" + title + "</title></head>\n");
        stringBuffer.append("<body>\n");
        stringBuffer.append("<h1>" + title + "</h1>\n");
        stringBuffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuffer.append("<tr>" + item.makeHTML() + "</tr>");
        }
        stringBuffer.append("</table>\n");
        stringBuffer.append("<hr><address>" + author + "</address>");
        stringBuffer.append("</body></html>\n");

        return stringBuffer.toString();
    }
}
