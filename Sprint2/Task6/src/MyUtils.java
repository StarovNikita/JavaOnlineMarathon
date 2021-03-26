import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Shape {
    // Code
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double CalculateArea();

    public String getName() {
        return name;
    }

}
class Rectangle  extends Shape {
    // Code
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    public Rectangle(String name, double height,double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    double CalculateArea() {
        return height*width;
    }
}
class Circle extends Shape {
    // Code
    private double radius;
    public double getRadius() {
        return radius;
    }
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double CalculateArea() {
        return 3.14*Math.pow(radius,2);
    }
}
public class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {
        // Code
       
        return null;
    }
}