package bai_tap;

import bai_tap.moveablepoint.MovablePoint;
import bai_tap.moveablepoint.Point;

public class Tester {
    public static void main(String[] args) {
        Point unknownPoint = new Point(20, 30);
        System.out.println(unknownPoint.toString());
        unknownPoint.setXY(10, 20);
        System.out.println(unknownPoint.toString());
        unknownPoint = new MovablePoint(unknownPoint.getX(), unknownPoint.getY(),10,20);
        System.out.println(unknownPoint.toString());
        ((MovablePoint) unknownPoint).move();
        System.out.println(unknownPoint.toString());
//        MovablePoint anotherPoint = new MovablePoint(20, 20);
//        System.out.println(anotherPoint.toString());
//        anotherPoint.move();
//        System.out.println(anotherPoint.toString());
    }
}
