/*
x and y coordinates
no-arg constructor for 0,0
constructor for point with specific coordinates
method distance returns distance from this point to specified point of myPoint type
method distance returns the distance from this point to another with x,y coordinate
static method distance returns distance from 2 myPoint objects
test all methods
*/

public class myPoint {
    double x;
    double y;

    myPoint(){
        x = 0;
        y = 0;
    }

    myPoint(double newX, double newY){
        x = newX;
        y = newY;
    }

    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    double distance(myPoint distantPoint){
        return Math.hypot(distantPoint.getX() - x, distantPoint.getY() - y);
    }
    double distance(double distantX, double distantY){
        return Math.hypot(distantX -x, distantY - y);
    }
    static double distance(myPoint pointOne, myPoint pointTwo){
        return Math.hypot(pointTwo.getX() - pointOne.getX(), pointTwo.getY() - pointOne.getY());
    }

    public static void main(String[] args){
        myPoint testPointOne = new myPoint();
        myPoint testPointTwo = new myPoint(10,30.5);
        System.out.println("distance between points: " + myPoint.distance(testPointOne, testPointTwo));
    }
}
