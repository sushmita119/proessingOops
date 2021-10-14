package com.thoughtworks.processing;

import com.thoughtworks.processing.model.Canvas;
import com.thoughtworks.processing.model.Circle;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application extends PApplet {
    List<Circle> listOfCircle = new ArrayList<>();
    public static void main(String[] args) {
        PApplet.main("com.thoughtworks.processing.Application", args);
    }

    @Override
    public void settings() {
        super.settings();
        Canvas canvas = new Canvas(700, 1000);
        size(canvas.getWidth(), canvas.getHeight());
        Circle circle1 = new Circle(15, 15, canvas.getHeight() / 5, 1);
        Circle circle2 = new Circle(15, 15, (canvas.getHeight() * 2) / 5, 2);
        Circle circle3 = new Circle(15, 15, (canvas.getHeight() * 3) / 5, 5);
        Circle circle4 = new Circle(15, 15, (canvas.getHeight() * 4) / 5, 7);

        listOfCircle.addAll(Arrays.asList(circle1, circle2, circle3, circle4));
    }

    @Override
    public void draw() {
        for (Circle circle : listOfCircle) {
            ellipse(circle.getxPosition(), circle.getyPosition(), circle.getDiameter(), circle.getCircumference());
            circle.move();
        }
    }
}


