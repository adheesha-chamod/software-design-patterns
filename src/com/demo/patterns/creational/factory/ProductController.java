package com.demo.patterns.creational.factory;

import com.demo.patterns.creational.factory.arc.ArcController;
import com.demo.patterns.creational.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

//public class ProductController extends ArcController {
//    public void getProductsList() {
//        // get products from DB
//        Map<String, Object> context = new HashMap<>();
//        // context.put(products);
//        render("productsView", context);
//    }
//}

public class ProductController extends SharpController {
    public void getProductsList() {
        // get products from DB
        Map<String, Object> context = new HashMap<>();
        // context.put(products);
        render("productsView", context);
    }
}
