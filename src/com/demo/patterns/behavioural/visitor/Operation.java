package com.demo.patterns.behavioural.visitor;

public interface Operation {
    void apply(HeadingNode headingNode);

    void apply(AnchorNode anchorNode);
}
