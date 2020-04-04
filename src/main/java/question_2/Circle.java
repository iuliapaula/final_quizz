package question_2;

public class Circle implements Shape {
    private int radius;

    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
