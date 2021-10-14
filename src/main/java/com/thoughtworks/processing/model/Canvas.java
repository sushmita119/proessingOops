package com.thoughtworks.processing.model;

public class Canvas {
    private final int height;
    private final int width;

    public Canvas(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
