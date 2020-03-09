package com.liukaining.design_pattern.abstract_factory.listfactory;

import com.liukaining.design_pattern.abstract_factory.factory.*;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
