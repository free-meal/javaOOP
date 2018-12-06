public class IllegalTriangleException extends Exception {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    public IllegalTriangleException(double sideOne, double sideTwo, double sideThree){
        super("Triangle with sides " + sideOne + ", " + sideTwo + ", and " + sideThree + " is illegal");
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne(){
        return sideOne;
    }
    public double getSideTwo(){
        return sideTwo;
    }
    public double getSideThree(){
        return sideThree;
    }
}
