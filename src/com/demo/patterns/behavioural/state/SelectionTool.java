package com.demo.patterns.behavioural.state;

public class SelectionTool extends Tool {

    @Override
    public void mouseUp() {
        System.out.println("Draw a rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }
}
