/*
double x,y center w/ getter and setter
width and height w/ getter and setter
no-arg defaults 0,0 and w,h=1
constructor with specific values
getArea returns area
getPerimeter returns perimeter
contains(double x, double y) true if contained
contains(myRectangle2D r) true if inside rectangle
overlaps(myrectangle2d r) true if overlaps
*/

public class myRectangle2D {
    double x;
    double y;
    double width;
    double height;

    myRectangle2D(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    myRectangle2D(double newX, double newY, double newWidth, double newHeight){
        x = newX;
        y = newY;
        width = newWidth;
        height = newHeight;
    }

    double getX(){
        return x;
    }
    void setX(double newX){
        x = newX;
    }

    double getY(){
        return y;
    }
    void setY(double newY){
        y = newY;
    }

    double getWidth(){
        return width;
    }
    void setWidth(double newWidth){
        width = newWidth;
    }

    double getHeight(){
        return height;
    }
    void setHeight(double newHeight){
        height = newHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return 2 * width + 2 * height;
    }

    boolean contains(double checkX, double checkY){
        return Math.abs(x - checkX) < width/2 && Math.abs(y - checkY) < height/2;
    }

    boolean contains(myRectangle2D r){
        return contains(r.getX() - r.getWidth()/2, r.getY() - r.getHeight()/2) &&
                contains(r.getX() - r.getWidth()/2, r.getY() + r.getHeight()/2) &&
                contains(r.getX() + r.getWidth()/2, r.getY() + r.getHeight()/2) &&
                contains(r.getX() + r.getWidth()/2, r.getY() - r.getHeight()/2);
    }

    boolean overlaps(myRectangle2D r){
        return contains(r.getX() - r.getWidth()/2, r.getY() - r.getHeight()/2) ||
                contains(r.getX() - r.getWidth()/2, r.getY() + r.getHeight()/2) ||
                contains(r.getX() + r.getWidth()/2, r.getY() + r.getHeight()/2) ||
                contains(r.getX() + r.getWidth()/2, r.getY() - r.getHeight()/2);
    }
    /*
    test program
r1(2,2,5.5,4.9)
display area, perimeter
contains(3,3)
contains(rectangle(4,5,10.5,3.2)
overlaps(rectangle(3,5,2.3,5.4)
 */

    public static void main(String[] args){
        myRectangle2D r1 = new myRectangle2D(2,2,5.5,4.9);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Contains (3,3)? " + r1.contains(3,3));
        System.out.println("Contains first new rectangle? " + r1.contains(new myRectangle2D(4,5,10.5,3.2)));
        System.out.println("Overlaps second new rectangle? " + r1.overlaps(new myRectangle2D(3,5,2.3,5.4)));
    }

}
