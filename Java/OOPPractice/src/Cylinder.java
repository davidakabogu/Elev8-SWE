public class Cylinder extends Shape{
    public Cylinder(double radius, double height){
        super(radius, height);
    }
    @Override
    public double area() {
        return ((2 * Math.PI * getRadius() * getHeight()) + (2 * Math.PI * Math.pow(getRadius(), 2)));
    }

    @Override
    public double volume() {
        return super.volume();
    }
}
