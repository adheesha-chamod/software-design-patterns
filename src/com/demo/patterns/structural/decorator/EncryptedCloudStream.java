package com.demo.patterns.structural.decorator;

public class EncryptedCloudStream implements Stream {
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encryptedData = encrypt(data);
        stream.write(encryptedData);
    }

    private String encrypt(String data) {
        return "~!@#$%^&*";
    }
}
