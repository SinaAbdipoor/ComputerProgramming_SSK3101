package ssk3101_assignment8;

import java.util.ArrayList;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Triangle(5, 8));
        shapes.add(new Square(4));
        shapes.add(new Cube(2));
        shapes.add(new Sphere(6));
        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }
    }
}
