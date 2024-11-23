package com.demo.patterns.creational.factory.arc;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
