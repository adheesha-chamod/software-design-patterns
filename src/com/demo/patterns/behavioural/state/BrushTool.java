package com.demo.patterns.behavioural.state;

public class BrushTool extends Tool {

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }
}
