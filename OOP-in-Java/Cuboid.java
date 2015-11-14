package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class Cuboid extends SpaceShape{

    private double width;
    private double depth;
    private double height;

    public Cuboid(Vertex3D vertex3D, double width, double height, double depth) {
        super(vertex3D);
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    @Override
    public double getVolume() {
        return this.width * this.height * this.depth;
    }

    @Override
    public double getArea() {
        return this.width * 2 + this.height * 2+ this.depth * 2 ;
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

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        if(depth < 0){
            throw  new IllegalArgumentException("The depth is less or equal to 0");
        }
        this.depth = depth;
    }

}