package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input cos6 = new Input();

//        Person p1 = new Person();
        Circle circle1 = new Circle(cos6.getDouble());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());


    }
}
