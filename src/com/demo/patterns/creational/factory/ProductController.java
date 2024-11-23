package com.demo.patterns.creational.factory;

import com.demo.patterns.creational.factory.arc.Controller;
import com.demo.patterns.creational.factory.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends Controller {
    public void getProductsList() {
        // get products from DB
        Map<String, Object> context = new HashMap<>();
        // context.put(products);
        render("products.html", context);
    }
}

//public class ProductController extends SharpController {
//    public void getProductsList() {
//        // get products from DB
//        Map<String, Object> context = new HashMap<>();
//        // context.put(products);
//        render("products.html", context);
//    }
//}
