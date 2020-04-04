package question_2;

public class Square implements Shape {
    private int side;

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
