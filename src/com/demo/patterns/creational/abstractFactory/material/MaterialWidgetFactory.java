package com.demo.patterns.creational.abstractFactory.material;

import com.demo.patterns.creational.abstractFactory.Button;
import com.demo.patterns.creational.abstractFactory.TextBox;
import com.demo.patterns.creational.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
