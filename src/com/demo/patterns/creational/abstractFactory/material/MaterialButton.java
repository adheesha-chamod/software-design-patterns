package com.demo.patterns.creational.abstractFactory.material;

import com.demo.patterns.creational.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material button");
    }
}
