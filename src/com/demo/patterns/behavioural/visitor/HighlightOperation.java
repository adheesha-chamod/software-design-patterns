package com.demo.patterns.behavioural.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Highlight - heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlight - anchor");
    }
}
