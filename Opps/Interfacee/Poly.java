interface Shape {
    double area();  // Interface method
}

class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
    // Overloaded method (compile-time polymorphism)
    public double area(double scale) {
        return width * height * scale;
    }
}
// Usage
public class Poly {
    public static void main(String[] args) {
        Shape circle = new Circle(5);  // Polymorphic reference
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle area: " + circle.area());    // Output: Circle area: 78.53981633974483
        System.out.println("Rectangle area: " + rectangle.area());  // Output: Rectangle area: 24.0

        // Compile-time polymorphism (overloading)
        Rectangle rect = new Rectangle(4, 6);
        System.out.println("Scaled area: " + rect.area(2));  // Output: Scaled area: 48.0
    }
}