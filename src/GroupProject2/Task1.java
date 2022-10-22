package GroupProject2;

public class Task1 {
    /*Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.

     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(3);
        circle.calculatePerimiter(3);
        Square square = new Square();
        square.calculateArea(3);
        square.calculatePerimiter(3);

    }
}

interface Shapes {
    void calculateArea (double Area);

    void calculatePerimiter(double Perimiter);
}
class Square implements Shapes {
    public void calculateArea(double side) {

        System.out.println("Area of a Square is "+(side * 2));
    }

    public void calculatePerimiter(double side) {

        System.out.println("Perimeter of a Square is "+(side * 4));
    }
}

class Circle implements Shapes {

    public void calculateArea(double radius) {

        System.out.println("Area of a Circle is "+(Math.PI * (radius * radius)));
    }

    public void calculatePerimiter(double radius) {
        System.out.println("Perimeter of a Circle is "+(2 * Math.PI * radius));
    }

}
