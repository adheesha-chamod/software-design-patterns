package com.demo.patterns.creational.builder;

public class Movie {
    public void addFrame(String text, int duration) {
        System.out.println(String.format("Adding a frame to the movie - %s : %dmin", text, duration));
    }
}
