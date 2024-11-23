package com.demo.patterns.creational.abstractFactory;

import com.demo.patterns.creational.abstractFactory.ant.AntWidgetFactory;
import com.demo.patterns.creational.abstractFactory.app.ContactForm;
import com.demo.patterns.creational.abstractFactory.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
