package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class SquarePyramid extends SpaceShape {

    private double width;
    private double height;

    public SquarePyramid(Vertex3D vertex3D, double width, double height) {
        super(vertex3D);
        setWidth(width);
        setHeight(height);
    }

    @Override
    public double getVolume() {
        return Math.pow(this.width, 2) * (this.height / 3);
    }

    @Override
    public double getArea() {
        return Math.pow(this.width, 2) + 2 * this.width * Math.sqrt((Math.pow(this.width, 2) / 4) + Math.pow(this.height, 2));
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            throw  new IllegalArgumentException("The width is less or equal to 0");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            throw  new IllegalArgumentException("The height is less or equal to 0");
        }
        this.height = height;
    }



}