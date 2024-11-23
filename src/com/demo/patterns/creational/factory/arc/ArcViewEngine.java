package com.demo.patterns.creational.factory.arc;

import java.util.Map;

public class ArcViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
       return String.format("<h1>%s - View rendered by Arc!</h1>", viewName);
    }
}
