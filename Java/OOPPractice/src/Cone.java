public class Cone extends Shape {
    public Cone(double radius, double height) {
        super(radius, height);
    }
    private double length;
    @Override
    public double area() {
        return (Math.PI * getRadius() * (getRadius() +(Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2)))));
    }

    @Override
    public double volume() {
        return super.volume();
    }
}
