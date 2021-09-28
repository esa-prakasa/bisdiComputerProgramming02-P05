package bisdi.pertemuan05;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1, radius: " + circle1.radius + " Area: " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("Circle 2, radius: " + circle2.radius + " Area: " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("Circle 3, radius: " + circle3.radius + " Area: " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("Circle 2, radius: " + circle2.radius + " Area: " + circle2.getArea());

        System.out.println("Area of anonymous circle with radius 5: "+new Circle(5).getArea());
    }
}

class Circle{
    double radius;

    Circle(){
        radius = 1;
    }

    Circle (double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2* radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}


