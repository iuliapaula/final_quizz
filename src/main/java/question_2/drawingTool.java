package question_2;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class drawingTool {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String insertAnotherShape = "yes";
        Set<String> shapeTypeList = new HashSet<>();
        ShapesList shapesList = new ShapesList(new HashSet<Shape>());

        while (true) {
            System.out.println("Please insert the name of a shape (rectangle, square, circle or triangle): ");
            String shapeType = scanner.nextLine();
            if (insertAnotherShape.equals("yes")) {
                if (shapeTypeList.size() != 0) {
                    for (String s : shapeTypeList) {
                        if (s.equalsIgnoreCase(shapeType)) {
                            throw new IOException("Shape already exists in the drawing tool");
                        }
                    }
                }
                shapeTypeList.add(shapeType);
                switch (shapeType) {
                    case "circle":
                        System.out.println("Insert radius: ");
                        Shape circle = new Circle(Integer.parseInt(scanner.nextLine()));
                        shapesList.addShape(circle);
                        break;
                    case "rectangle":
                        System.out.println("Insert long side and short side: ");
                        String[] rectangleSides = scanner.nextLine().split(" ");
                        int longSide = Integer.parseInt(rectangleSides[0]);
                        int shortSide = Integer.parseInt(rectangleSides[1]);
                        Shape rectangle = new Rectangle(longSide, shortSide);
                        shapesList.addShape(rectangle);
                        break;
                    case "square":
                        System.out.println("Insert side");
                        Shape square = new Square(Integer.parseInt(scanner.nextLine()));
                        shapesList.addShape(square);
                        break;
                    case "triangle":
                        System.out.println("Insert the three sides: ");
                        String[] triangleSides = scanner.nextLine().split(" ");
                        int side1 = Integer.parseInt(triangleSides[0]);
                        int side2 = Integer.parseInt(triangleSides[1]);
                        int side3 = Integer.parseInt(triangleSides[2]);
                        Shape triangle = new Triangle(side1, side2, side3);
                        shapesList.addShape(triangle);
                        break;
                    default:
                        throw new IOException("Selected shape does not exist in list");
                }
            }
            System.out.println("Do you wish to insert another shape? yes/no");
            insertAnotherShape = scanner.nextLine();
            if (insertAnotherShape.toLowerCase().equals("no")) {
                break;
            }
        }
        shapesList.printTotalPerimeter();
        shapesList.printTotalArea();
    }
}
