package com.softuni5;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class Vertex3D extends Vertex {
    private double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.setZ(z);
    }

    public double getZ() {

        return z;
    }

    public void setZ(double z) {

        this.z = z;
    }


}
