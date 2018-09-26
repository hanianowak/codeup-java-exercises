package shapes;

public class Square extends Quadrilateral {

//    public Square(int side) {
//        super(side,side);  // super has to be the first
//    }
//
//    public int getArea() {
//        return (length * length);
//    }
//
//    public int getPerimeter() {
//        return (4*length);
//    }


    public Square(int side) {
        super(side, side);
    }

    @Override
    void setLength(int length) {

    }

    @Override
    void setWidth(int length) {

    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
