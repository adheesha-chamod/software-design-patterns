package com.demo.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("user", "root");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("user"));
    }
}
