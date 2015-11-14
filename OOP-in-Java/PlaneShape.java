package com.softuni5;

import com.softuni5.Interface.AreaMeasurable;
import com.softuni5.Interface.PerimeterMeasurable;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    public PlaneShape(Vertex... vertex) {
        super(vertex);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Vertex vertex : this.getVertices()){
            result.append(String.format(" Vertex : %.4f %.4f ,", vertex.getX(), vertex.getY()));

        }
        return super.toString() + result.toString() + String.format(" Area: %.4f, Perimeter: %.4f", this.getPerimeter(), this.getPerimeter());
    }

}
