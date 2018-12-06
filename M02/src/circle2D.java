/*
double data fields x and y center of circle, with getter methods
data field radius with getter
no arg constructor default x,y = 0,0 radius=1
constructor with specified x,y,radius
getArea returns area
getPerimeter returns perimeter
contains(double x,double y) returns true if x,y inside circle
contains(circle2d circle) true if spec circle inside this circle
overlaps(circle2d circle) if spec circle overlaps

test program
creates circle2d c1(2,2,5.5), print area/perimeter
contains(3,3)
contains(circle2d(4,5,10.5)
overlaps(circle2d(3,5,2.3)
 */
public class circle2D {
    double x;
    double y;
    double radius;

    circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }
    circle2D(double newX, double newY, double newRadius){
        x = newX;
        y = newY;
        radius = newRadius;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    double getPerimeter(){
        return Math.PI * radius *  2;
    }
    boolean contains(double checkX, double checkY){
        return Math.hypot(getX() - checkX, getY() - checkY) < radius;
    }
    boolean contains(circle2D otherCircle){
        return Math.hypot(getX() - otherCircle.getX(), getY() - otherCircle.getY()) + otherCircle.getRadius() < radius;
    }
    boolean overlaps(circle2D otherCircle){
        return Math.hypot(getX() - otherCircle.getX(), getY() - otherCircle.getY()) < radius + otherCircle.getRadius();
    }
    public static void main(String[] args){
        circle2D c1 = new circle2D(2,2,5.5);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("c1 contains point 3,3: " + c1.contains(3,3));
        System.out.println("c1 contains first new circle: " + c1.contains(new circle2D(4,5,10.5)));
        System.out.println("c1 overlaps with second new circle: " + c1.overlaps(new circle2D(3,5,2.3)));
    }
}
