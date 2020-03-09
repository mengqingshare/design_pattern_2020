package com.liukaining.design_pattern.abstract_factory.factory;

import java.io.FileWriter;
import java.io.*;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * @param item
     */
    public void add(Item item) {
        content.add(item);
    }

    /**
     *
     */
    public void output() {
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println(fileName + " 编写完成 ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();
}
