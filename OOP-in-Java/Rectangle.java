package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class Rectangle extends PlaneShape {

    private double height;

    private double width;

    private double perimeter;

    private double area;

    public void setPerimeter() {
        this.perimeter = getPerimeter();
    }

    public void setArea() {
        this.area = getArea();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double _height) {
        if (_height <= 0) {
            throw new IllegalArgumentException("The height is less or equal to 0");
        }
        this.height = _height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double _width) {
        if (_width <= 0) {
            throw new IllegalArgumentException("The width is less or equal to 0");
        }
        this.width = _width;
    }

    public Rectangle(Vertex2D vertex, double height, double width) {
        super(vertex);
        setHeight(height);
        setWidth(width);
    }

    @Override
    public double getPerimeter() {
        return this.width*2+this.height*2;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
}
