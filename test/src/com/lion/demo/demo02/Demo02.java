package com.lion.demo.demo02;

class Point {
    int x, y;

    Point(int a, int b) {
        x = a;
        y = b;
    }
}

public class Demo02 {
    public static void main(String[] args) {
//        Point p1, p2;
//        p1 = new Point(10, 10);
//        p2 = new Point(23, 35);
        Point p1 = new Point(10,20);
        System.out.println(p1.x+" "+p1.y);
    }
}


