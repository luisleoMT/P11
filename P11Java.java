// Define an interface called 'Shape'.
interface Shape {
    // Method 'draw' that needs to be implemented by subclasses
    void draw();
}

// 'Circle' is a concrete class that implements 'Shape'.
class Circle implements Shape {
    String color;
    double radius;

    // Constructor for 'Circle'
    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    // Implement the 'draw' method for circles
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}

// 'Rectangle' is another concrete class that implements 'Shape'.
class Rectangle implements Shape {
    String color;
    double width;
    double height;

    // Constructor for 'Rectangle'
    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    // Implement the 'draw' method for rectangles
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with width " + width + " and height " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("red", 1.5);
        Shape rectangle = new Rectangle("blue", 4, 2);

        circle.draw();  // Outputs: Drawing a red circle with radius 1.5
        rectangle.draw();  // Outputs: Drawing a blue rectangle with width 4 and height 2
    }
}
