package com.demo.patterns.creational.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        Component newComponent = component.clone();
        // add to the target document
    }
}
