package com.demo.patterns.behavioural.iterator;

public class Main {

    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("a.com");
        history.push("b.com");
        history.push("c.com");

        Iterator iterator = history.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
