package com.demo.patterns.behavioural.strategy;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying black and white filter");
    }
}
