package com.lion.demo.demo02;

public class Circle {
    double radius, area;

//    public double getRadius() {
//        return radius;
//    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    public void setArea(double area) {
//        this.area = area;
//    }

    public double getArea() {
        area = 3.14 * radius * radius;
        return area;
    }
}
