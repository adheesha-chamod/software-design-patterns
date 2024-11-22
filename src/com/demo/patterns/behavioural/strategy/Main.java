package com.demo.patterns.behavioural.strategy;

public class Main {

    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store(
                "image1.jpeg",
                new JpegCompressor(),
                new BlackAndWhiteFilter()
        );

        imageStorage.store(
                "image2.png",
                new PngCompressor(),
                new HighContrastFilter()
        );
    }
}
