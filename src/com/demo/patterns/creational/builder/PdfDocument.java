package com.demo.patterns.creational.builder;

public class PdfDocument {
    public void addPage(String text) {
        System.out.println(String.format("Adding a page to PDF - %s", text));
    }
}
