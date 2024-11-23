package com.demo.patterns.structural.adapter.beautyFilters;

import com.demo.patterns.structural.adapter.Image;

public class Caramel {
    public void init() {
        System.out.println("Initializing Caramel class");
    }

    public void render(Image image) {
        System.out.println("Applying caramel filter");
    }
}
