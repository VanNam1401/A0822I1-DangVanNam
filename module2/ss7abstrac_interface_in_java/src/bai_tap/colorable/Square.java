package bai_tap.colorable;

import bai_tap.colorable.Shape;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {

        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                +getArea();
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
