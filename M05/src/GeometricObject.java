
public class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    private double area = 0;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
        this.area = 0;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return this.area;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public GeometricObject max(GeometricObject otherObject){
        if (compareTo(otherObject) < 0){
            return otherObject;
        }
        else
            return this;
    }

    @Override
    public int compareTo(GeometricObject otherObject){
        if (getArea() > otherObject.getArea()){
            return 1;
        }
        else if (getArea() < otherObject.getArea()){
            return -1;
        }
        else
            return 0;
    }

    public static void main(String[] args){
        Circle testCircle1 = new Circle(5,"red",false);
        Circle testCircle2 = new Circle(10, "blue", false);
        Rectangle testRectangle1 = new Rectangle(3,5,"red",false);
        Rectangle testRectangle2 = new Rectangle(2,4,"blue", false);
        System.out.println("The blue circle is larger and will be returned: ");
        System.out.println(testCircle1.max(testCircle2).toString());
        System.out.println("The red rectangle is larger and will be returned: ");
        System.out.println(testRectangle1.max(testRectangle2).toString());
    }
}
