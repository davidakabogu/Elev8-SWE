// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Cylinder babycylinder = new Cylinder(2, 4);
//        Cone babycone = new Cone(2,4);
//        System.out.println(babycylinder.area());
//        System.out.println(babycone.area());

//        This is what polymorphism is...
        Shape babyshape = new Cylinder(2, 4);
        System.out.println(babyshape.area());
        babyshape = new Cone(2, 4);
        System.out.println(babyshape.area());

    }
}