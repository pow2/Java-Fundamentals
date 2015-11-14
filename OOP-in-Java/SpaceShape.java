package com.softuni5;

import com.softuni5.Interface.AreaMeasurable;
import com.softuni5.Interface.VolumeMeasurable;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    public SpaceShape(Vertex3D... vertex) {
        super(vertex);
    }



    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Vertex normal : this.getVertices()){
            Vertex3D vertex = ((Vertex3D) normal);
            result.append(String.format(" Vertex : %.4f %.4f %.4f ,", vertex.getX(), vertex.getY(), vertex.getZ()));

        }
        return super.toString() + result.toString() + String.format(" Area: %.4f, Volume: %.4f", this.getArea(), this.getVolume());
    }
}
