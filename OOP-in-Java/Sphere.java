package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(Vertex3D vertex, double radius){
        super(vertex);
        this.setRadius(radius);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(this.radius, 3);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0) {
            throw new IllegalArgumentException("The radius is less or equal to 0");
        }
        this.radius = radius;
    }

}
