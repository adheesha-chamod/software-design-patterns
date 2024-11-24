package com.demo.patterns.structural.facade;

public class NotificationService {
    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("192.0.2.146");
        AuthToken authToken = server.authenticate("app-1", "key1-app1-1001-abc");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
