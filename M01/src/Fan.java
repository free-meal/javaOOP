public class Fan {
    // Constants SLOW=1 MEDIUM=2 FAST=3
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    // private int named speed (default slow)
    private int speed;
    // private boolean on (default false)
    private boolean on;
    // private double radius for radius of fan (default 5)
    private double radius;
    String color;
    // accessor and mutator for all data
    void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    int getSpeed(){
        return speed;
    }
    void setOn(boolean newOn){
        on = newOn;
    }
    boolean getOn(){
        return on;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
    double getRadius(){
        return radius;
    }
    void setColor(String newColor){
        color = newColor;
    }
    String getColor(){
        return color;
    }
    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public String toString(){
        String returnString;
        if (on){
            returnString = "Fan speed is "+speed+", it's color is "+color+", and it's radius is "+radius;
        }
        else {
            returnString = "Fan's color is "+color+", it's radius is "+radius+" and the fan is off";
        }
        return returnString;
    }
    public static void main(String[] args){
        Fan testFanOne = new Fan();
        testFanOne.setSpeed(FAST);
        testFanOne.setRadius(10);
        testFanOne.setColor("yellow");
        testFanOne.setOn(true);

        System.out.println(testFanOne.toString());

        Fan testFanTwo = new Fan();
        testFanOne.setSpeed(MEDIUM);
        testFanOne.setRadius(5);
        testFanOne.setColor("blue");
        testFanOne.setOn(false);

        System.out.println(testFanTwo.toString());
    }

}
