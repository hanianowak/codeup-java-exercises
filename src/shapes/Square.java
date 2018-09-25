package shapes;

public class Square extends Rectangle {

    protected int side;

    public Square(int side) {
        super(side,side);
        this.side = side;
    }


//
//    public void setSquare(int side) {
//        width = side;
//        length = side;
//    }


    public int getArea() {
        return (side * side);
    }

    public int getPerimeter() {
        return (4*side);


    }
}
