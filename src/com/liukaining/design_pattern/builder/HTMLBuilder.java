package com.liukaining.design_pattern.builder;

import java.io.*;

public class HTMLBuilder extends Builder {
    private String fileName;
    private PrintWriter printWriter;


    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        try {
            printWriter = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>" + title + "</title></head><body>");
        printWriter.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String string) {
        printWriter.println("<p>" + string + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            printWriter.println("<li>" + items[i] + "</li>");
        }
        printWriter.println("</ul>");
    }

    @Override
    public void close() {
        printWriter.println("</body></html>");
        printWriter.close();
    }

    /**
     * @return
     */
    public String getResult() {
        return fileName;
    }
}
