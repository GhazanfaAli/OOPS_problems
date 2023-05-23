// ~~> Create a class Square with a method to initialize its side, calculating area, perimeter etc.
// ~~> Create a class Rectangle & problem 3.
// ~~> Repeat problem 4 for a circle.

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area ==> " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference ==> " + circumference);
    }
}

class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle ==> : " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle ==> : " + perimeter);
    }
}

public class Square {
    double legnth;
    Square(double legnth){
        this.legnth = legnth;
    }
    void area(){
       System.out.println(legnth*legnth);
    }
    void perimeter(){
        System.out.println(4*legnth);
    }
    public static void main(String args[]){
    Square ob1 = new Square(10);
    Rectangle obj2 = new Rectangle(5, 3);
    Circle obj3 = new Circle(3);
    ob1.area();
    ob1.perimeter();
    obj2.calculateArea();
    obj2.calculatePerimeter();
    obj3.calculateArea();
    obj3.calculateCircumference();

    }
}
