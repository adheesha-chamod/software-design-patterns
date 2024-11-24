package com.demo.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("Hello world!", "172.1.6.275");
    }
}
