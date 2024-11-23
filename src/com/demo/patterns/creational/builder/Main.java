package com.demo.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        PdfDocumentBuilder pdfBuilder = new PdfDocumentBuilder();
        presentation.export(pdfBuilder);
        PdfDocument pdf = pdfBuilder.getPdfDocument();

        MovieBuilder movieBuilder = new MovieBuilder();
        presentation.export(movieBuilder);
        Movie movie = movieBuilder.getMovie();
    }
}
