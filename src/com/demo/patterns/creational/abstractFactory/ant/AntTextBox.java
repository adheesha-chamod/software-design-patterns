package com.demo.patterns.creational.abstractFactory.ant;

import com.demo.patterns.creational.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant textbox");
    }
}
