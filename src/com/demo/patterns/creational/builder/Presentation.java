package com.demo.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        for (Slide slide : slides) {
            builder.addSlide(slide);
        }
        builder.addSlide(new Slide("Copyright 2024"));
    }
}
