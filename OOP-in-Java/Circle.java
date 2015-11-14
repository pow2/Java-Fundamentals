package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class Circle extends PlaneShape {

    private double radius;

    public double getRadius() {
        return radius;
    }


    public void setRadius(double _radius) {
        if (_radius <= 0) {
            throw new IllegalArgumentException("The radius is less or equal to 0");
        }
        this.radius = _radius;
    }

    public Circle(Vertex2D vertex, double radius) {
        super(vertex);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }


}
