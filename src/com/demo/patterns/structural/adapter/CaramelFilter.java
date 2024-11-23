package com.demo.patterns.structural.adapter;

import com.demo.patterns.structural.adapter.beautyFilters.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        // requirement set by the 3rd party lib
        caramel.init();
        caramel.render(image);
    }
}
