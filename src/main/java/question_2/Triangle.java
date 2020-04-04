package question_2;

public class Triangle implements Shape {
    private int side1;
    private int side2;
    private int side3;

    @Override
    public int getArea() {
        double halfPerimeter = (double) getPerimeter() / 2;
        return (int) Math.pow(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3), 0.5);
    }

    @Override
    public int getPerimeter() {
        return side1 + side2 + side3;
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
