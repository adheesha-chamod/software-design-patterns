package com.demo.patterns.creational.abstractFactory.ant;

import com.demo.patterns.creational.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant button");
    }
}
