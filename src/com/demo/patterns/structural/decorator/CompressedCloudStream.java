package com.demo.patterns.structural.decorator;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressedData = compress(data);
        stream.write(compressedData);
    }

    private String compress(String data) {
        return data.substring(0, 2);
    }
}
