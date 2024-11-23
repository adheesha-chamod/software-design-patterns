package com.demo.patterns.creational.prototype;

public interface Component {
    void render();

    Component clone();
}
