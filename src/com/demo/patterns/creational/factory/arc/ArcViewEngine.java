package com.demo.patterns.creational.factory.arc;

import java.util.Map;

public class ArcViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
       return "View rendered by Arc";
    }
}
