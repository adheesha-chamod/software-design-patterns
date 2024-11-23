package com.demo.patterns.creational.factory.sharp;

import com.demo.patterns.creational.factory.arc.ArcController;
import com.demo.patterns.creational.factory.arc.ViewEngine;

public class SharpController extends ArcController {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
