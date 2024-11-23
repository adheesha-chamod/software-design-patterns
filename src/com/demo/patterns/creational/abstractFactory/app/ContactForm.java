package com.demo.patterns.creational.abstractFactory.app;

import com.demo.patterns.creational.abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
