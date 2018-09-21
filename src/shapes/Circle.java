package shapes;



public class Circle {
    private double radius;

    public Circle(double radiuss) {
        radius = radiuss;
    }


    public double getArea() {
        double area = Math.PI * (radius * radius);
        return (area);
    }


    public double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }


}
