package com.demo.patterns.creational.builder;

public class MovieBuilder implements PresentationBuilder {
    private Movie movie = new Movie();

    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 2);
    }

    public Movie getMovie() {
        return movie;
    }
}
