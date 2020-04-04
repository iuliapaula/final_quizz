package question_2;

public class Rectangle implements Shape {
    private int longSide;
    private int shortSide;

    @Override
    public int getArea() {
        return longSide * shortSide;
    }

    @Override
    public int getPerimeter() {
        return 2 * (longSide + shortSide);
    }

    public Rectangle(int longSide, int shortSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }
}
