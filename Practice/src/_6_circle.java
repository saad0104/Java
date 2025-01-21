class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class _6_circle {
    public static void main(String[] args) {
        int rad = 5;
        Circle c = new Circle(rad);  // Parameter passed into the constructor
        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.area());
    }
}
