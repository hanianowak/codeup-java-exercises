package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input cos6 = new Input();
        
        double radius = cos6.getDouble();
        Circle circle1 = new Circle(radius);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        
    }
}
