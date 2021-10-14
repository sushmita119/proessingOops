package com.thoughtworks.processing.model;

public class Circle {
    private final int diameter;
    private final int circumference;
    private int xPosition;
    private final int yPosition;
    private final int speed;

    public Circle(int diameter, int circumference, int yPosition, int speed) {
        this.diameter = diameter;
        this.circumference = circumference;
        this.speed = speed;
        this.xPosition = 0;
        this.yPosition = yPosition;
    }

    public void move() {
        this.xPosition += speed;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getCircumference() {
        return circumference;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getSpeed() {
        return speed;
    }
}
