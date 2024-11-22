package com.demo.patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private final List<String> urls;

    public BrowseHistory() {
        urls = new ArrayList<>();
    }

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        if (urls.isEmpty()) {
            throw new IllegalStateException();
        }

        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastIndex);

        return lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private final BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
