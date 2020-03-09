package com.liukaining.design_pattern.iterator;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("this is 1st book"));
        bookShelf.appendBook(new Book("this is 2nd book"));
        bookShelf.appendBook(new Book("this is 3rd book"));
        bookShelf.appendBook(new Book("this is 4th book"));

        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());

        }
    }

}
