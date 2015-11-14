package com.softuni5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pow2 on 10.11.2015 y.
 */
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(new Vertex2D(8, 3), 2));
        shapes.add(new Cuboid(new Vertex3D(6, 5, 36), 20, 10, 5));
        shapes.add(new Rectangle(new Vertex2D(8, 5), 6, 7));
        shapes.add(new Sphere(new Vertex3D(7, 5, 12), 2));
        shapes.add(new SquarePyramid(new Vertex3D(-5, -19, -15), 4, 2));
        shapes.add(new Triangle(new Vertex2D(20, 10), new Vertex2D(5, 2), new Vertex2D(5, 8)));
        for (Shape shape : shapes) {
            if (shape instanceof PlaneShape) {
                PlaneShape planeShape = ((PlaneShape) shape);
                System.out.println(planeShape);
            } else if (shape instanceof SpaceShape) {
                SpaceShape spaceShape = ((SpaceShape) shape);
                System.out.println(spaceShape);
            }
        }
    }
}
