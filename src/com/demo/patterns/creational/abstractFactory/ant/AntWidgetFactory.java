package com.demo.patterns.creational.abstractFactory.ant;

import com.demo.patterns.creational.abstractFactory.Button;
import com.demo.patterns.creational.abstractFactory.TextBox;
import com.demo.patterns.creational.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
