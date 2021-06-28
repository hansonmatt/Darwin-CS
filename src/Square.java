public class Square implements Shape {

    private double sideLength; // internal variable (name + data type), sideLength is an identifier

    public Square(double theSideLength) { // constructor - how you construct a Square
        sideLength = theSideLength;
    }

    public double getArea() { // method
        return sideLength * sideLength;
    }

    public String getName() { // method
        return "Square";
    }
}
