package com.demo.patterns.creational.factory.sharp;

import com.demo.patterns.creational.factory.arc.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return String.format("<h1>%s - View rendered by Sharp!</h1>", viewName);
    }
}
