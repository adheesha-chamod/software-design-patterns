package com.demo.patterns.creational.abstractFactory.material;

import com.demo.patterns.creational.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material textbox");
    }
}
