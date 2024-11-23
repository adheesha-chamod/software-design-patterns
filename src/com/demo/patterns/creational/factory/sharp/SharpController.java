package com.demo.patterns.creational.factory.sharp;

import com.demo.patterns.creational.factory.arc.Controller;
import com.demo.patterns.creational.factory.arc.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
