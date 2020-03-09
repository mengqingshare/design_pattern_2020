package com.liukaining.design_pattern.abstract_factory.listfactory;

import com.liukaining.design_pattern.abstract_factory.factory.*;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("<html><head><title>" + title + "</title></head>\n");
        stringBuffer.append("<body>\n");
        stringBuffer.append("<h1>" + title + "</h1>\n");
        stringBuffer.append("<ul>\n");

        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuffer.append(item.makeHTML());
        }

        stringBuffer.append("</ul>\n");
        stringBuffer.append("<hr><address>" + author + "</address>");
        stringBuffer.append("</body></html>\n");

        return stringBuffer.toString();
    }
}
