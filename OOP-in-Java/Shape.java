package com.softuni5;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by pow2 on 10.11.2015 y.
 */
public abstract class Shape {
    private List<Vertex> vertices;

    public List<Vertex> getVertices() {
        return vertices;
    }
    private void add(Vertex[] vertices) {
        for (Vertex vertex : vertices){
            this.vertices.add(vertex);
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.getClass().getSimpleName()+ " with ");
        return result.toString();
    }

    public Shape(Vertex... vertex) {
        vertices = new ArrayList<>();
        this.add(vertex);
    }

}
