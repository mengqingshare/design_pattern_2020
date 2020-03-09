package com.liukaining.design_pattern.iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;


    /**
     * @param maxSize
     */
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    /**
     * @param index
     * @return
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * @param book
     */
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     * @return
     */
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
