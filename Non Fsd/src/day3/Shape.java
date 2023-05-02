package day3;

public class Shape {
    private String name;
    private double length;
    private double width;
    
    public Shape(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    
    public String getName() {
        return name;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
}

