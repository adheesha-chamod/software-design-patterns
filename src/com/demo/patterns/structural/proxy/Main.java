package com.demo.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // load books from db and add it into ebook library
        String[] fileNames = {"book-1", "book-2", "book-3"};
        for (String filename : fileNames) {
//            library.add(new RealEbook(filename));
            library.add(new EbookProxy(filename));
//            library.add(new LoggingEbookProxy(filename));
        }

        library.openEbook("book-1");
        library.openEbook("book-2");
    }
}
