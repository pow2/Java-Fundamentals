package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class Triangle extends PlaneShape{


    private double perimeter;

    private double area;

    public void setPerimeter() {
        this.perimeter = getPerimeter();
    }

    public void setArea() {
        this.area = getArea();
    }

    private Vertex2D a;
    private Vertex2D b;
    private Vertex2D c;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(this.b.getX() - this.a.getX(), 2) + Math.pow(this.b.getY() - this.a.getY(), 2))+
               Math.sqrt(Math.pow(this.c.getX() - this.b.getX(), 2) + Math.pow(this.c.getY() - this.b.getY(), 2))+
               Math.sqrt(Math.pow(this.a.getX() - this.c.getX(), 2) + Math.pow(this.a.getY() - this.c.getY(), 2));

    }

    @Override
    public double getArea() {
        return Math.abs((this.a.getX() * (this.b.getY() - this.c.getY()) + this.b.getX() * (this.c.getY() - this.a.getY()) + this.c.getX() * (this.a.getY() - this.b.getY())) / 2 );
    }

}
