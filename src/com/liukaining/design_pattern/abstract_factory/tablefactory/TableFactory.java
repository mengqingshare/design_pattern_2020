package com.liukaining.design_pattern.abstract_factory.tablefactory;

import com.liukaining.design_pattern.abstract_factory.factory.Factory;
import com.liukaining.design_pattern.abstract_factory.factory.Link;
import com.liukaining.design_pattern.abstract_factory.factory.Page;
import com.liukaining.design_pattern.abstract_factory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
