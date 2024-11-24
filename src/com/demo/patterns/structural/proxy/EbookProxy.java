package com.demo.patterns.structural.proxy;

public class EbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        // lazy initialization
        if (ebook == null) {
            ebook = new RealEbook(fileName);
        }

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
