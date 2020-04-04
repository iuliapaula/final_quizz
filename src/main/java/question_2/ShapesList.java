package question_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapesList {
    private Set<Shape> shapesList = new HashSet<>();

    public void printTotalPerimeter() {
        int totalPerimeter = 0;
        for (Shape shape : shapesList) {
            totalPerimeter += shape.getPerimeter();
        }
        System.out.println("Total perimeter of the shapes is: " + totalPerimeter);
    }

    public void printTotalArea() {
        int totalArea = 0;
        for (Shape shape : shapesList) {
            totalArea += shape.getArea();
        }
        System.out.println("Total area of the shapes is: " + totalArea);
    }

    public void addShape(Shape shape) {
        shapesList.add(shape);
    }
    public ShapesList(Set<Shape> shapesList) {
        this.shapesList = shapesList;
    }
}
