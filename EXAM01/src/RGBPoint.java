public class RGBPoint {
    private double x;
    private double y;
    private int r;
    private int g;
    private int b;

    public RGBPoint(double newX, double newY, int newR, int newG, int newB){
        x = newX;
        y = newY;
        r = newR;
        g = newG;
        b = newB;
    }

    public RGBPoint(double newX, double newY){
        this(newX, newY, 255, 255, 255);
    }

    public RGBPoint(int newR, int newG, int newB){
        this(0,0, newR, newG, newB);
    }

    public RGBPoint(){
        this(0, 0, 255, 255, 255);
    }

    public void mergeColors(int r, int g, int b){
        this.r = Math.abs(this.r - r);
        this.g = Math.abs(this.g - g);
        this.b = Math.abs(this.b - b);
    }

    public void mergeColors(RGBPoint other){
        this.mergeColors(other.r,other.g,other.b);
    }

    public void display(){
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
        System.out.println("R: " + this.r);
        System.out.println("G: " + this.g);
        System.out.println("B: " + this.b);
    }

    public double distance(RGBPoint other){
        return Math.hypot(this.x - other.x, this.y - other.y);
    }
}

class TestRGBPoint{
    public static void main(String[] args){
        RGBPoint testPointOne = new RGBPoint();
        RGBPoint testPointTwo = new RGBPoint(5, 5);
        RGBPoint testPointThree = new RGBPoint(40, 55, 255);
        RGBPoint testPointFour = new RGBPoint(5, 10,100, 30, 255);

        // Display objects to test construction was correct
        System.out.println("Point One:");
        testPointOne.display();

        System.out.println("Point Two:");
        testPointTwo.display();

        System.out.println("Point Three:");
        testPointThree.display();

        System.out.println("Point Four:");
        testPointFour.display();

        // Check correct calculation with known distance from 5,5 to 5,10
        System.out.println("The distance from Two to Four is 5: ");
        System.out.println(testPointTwo.distance(testPointFour) == 5);

        // Check that distance returns precision doubles correctly
        // (0-5)^2 + (0-10)^2 = 125, thus distance should return sqrt(125)
        System.out.println("The distance from One to Four is square root of 125: ");
        System.out.println(testPointOne.distance(testPointFour) == Math.sqrt(125));

        // Simple color merge check
        System.out.println("The colors of testPointTwo will be 200 after this merge: ");
        testPointTwo.mergeColors(55,55,55);
        testPointTwo.display();

        // Check absolute value with 40 - 100 merge
        System.out.println("The colors of testPointThree will be 60, 25, 0 after this merge: ");
        testPointThree.mergeColors(testPointFour);
        testPointThree.display();
    }
}
