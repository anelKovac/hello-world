public class Shape {
    int x, y;
    String color;

}

class Circle extends Shape{
    public static final double PI = 3.14;
    public double r = 10;

    public double area(){
        return r * r * PI;
    }
}
class Square extends Shape{
    public double a;
    public double area(){
        return a * a;
    }
}
class Rectangle extends Shape{
    public double a, b;
    public double area(){
        return a * b;
    }
}
class Main{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 100;
        c.y = 200;
        c.color = "red";
        c.r = 12;
        System.out.println(c.area());
    }
}
