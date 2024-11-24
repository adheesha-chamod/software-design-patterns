package com.demo.patterns.behavioural.visitor;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Extract plain text - heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Extract plain text - anchor");
    }
}
