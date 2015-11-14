package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public abstract class Vertex {

    private double x;

    private double y;

    public Vertex(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
