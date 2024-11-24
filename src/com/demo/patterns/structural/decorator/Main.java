package com.demo.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        storeName(new CloudStream(), "John Wick");
        storeImage(new CompressedCloudStream(new CloudStream()), "image1.jpg");
        storeCreditCard(new EncryptedCloudStream(new CloudStream()), "1234-5678-9012-3456");

        // store image -> compressed and encrypted
        storeImage(
                new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())),
                "image2.png"
        );
    }

    public static void storeName(Stream stream, String data) {
        stream.write(data);
    }

    public static void storeCreditCard(Stream stream, String data) {
        stream.write(data);
    }

    public static void storeImage(Stream stream, String data) {
        stream.write(data);
    }
}
