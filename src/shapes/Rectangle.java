package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    @Override
    void setLength(int length) {

    }

    @Override
    void setWidth(int width) {

    }

    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    public Rectangle(int length, int width) {
        super(length, width);
    }
}
