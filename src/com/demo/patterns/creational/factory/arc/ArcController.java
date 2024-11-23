package com.demo.patterns.creational.factory.arc;

import java.util.Map;

public class ArcController {
    public void render(String viewName, Map<String, Object> context) {
        ViewEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new ArcViewEngine();
    }
}
