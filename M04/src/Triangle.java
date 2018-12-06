import java.util.Scanner;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
// default no-arg constructor
    public Triangle() {
    }
// create triangle with specified sides
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setSide1(side1);
        this.setSide2(side2);
        this.setSide3(side3);
    }
// get/set methods for sides
    public double getSide1(){
        return side1;
    }

    public void setSide1(double side1) throws IllegalTriangleException{
        if (side1 <= this.side2 + this.side3)
            this.side1 = side1;
        else
            throw new IllegalTriangleException(side1 , this.side2, this.side3);
    }

    public double getSide2(){
        return side2;
    }

    public void setSide2(double side2) throws IllegalTriangleException{
        if (side2 <= this.side1 + this.side3)
            this.side2 = side2;
        else
            throw new IllegalTriangleException(this.side1, side2, this.side3);
    }

    public double getSide3(){
        return side3;
    }

    public void setSide3(double side3) throws IllegalTriangleException{
        if (side3 <= this.side2 + this.side1)
            this.side3 = side3;
        else
            throw new IllegalTriangleException(this.side1, this.side2, side3);
    }

    public double getArea(){
        double p = this.getPerimeter()/2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Triangle testTriangle = new Triangle();
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        testTriangle.setSide1(inputReader.nextDouble());
        System.out.println("Enter side 2: ");
        testTriangle.setSide2(inputReader.nextDouble());
        System.out.println("Enter side 3: ");
        testTriangle.setSide3(inputReader.nextDouble());
        inputReader.nextLine(); // Consume the newline character
        System.out.print("Enter the color: ");
        testTriangle.setColor(inputReader.nextLine());
        System.out.println("Is the triangle filled? (Y/n): ");
        while(true){
            String answer = inputReader.nextLine();
            if (answer.equalsIgnoreCase("y")){
                testTriangle.setFilled(true);
                break;
            }
            else if (answer.equalsIgnoreCase("n")){
                testTriangle.setFilled(false);
                break;
            }
            else{
                System.out.println("Is the triangle filled? (Y/n): ");
            }
        }
        System.out.println("Triangle Attributes: ");
        System.out.println("Area: " + testTriangle.getArea());
        System.out.println("Perimeter: " + testTriangle.getPerimeter());
        System.out.println("Color: " + testTriangle.getColor());
        System.out.println("Filled? " + testTriangle.isFilled());

    }
}


