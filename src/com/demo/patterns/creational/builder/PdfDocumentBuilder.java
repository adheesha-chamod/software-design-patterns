package com.demo.patterns.creational.builder;

public class PdfDocumentBuilder implements PresentationBuilder {
    private PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument() {
        return document;
    }
}