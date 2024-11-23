package com.demo.patterns.structural.adapter;

import com.demo.patterns.structural.adapter.beautyFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
