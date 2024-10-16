/*Assignment name: Circle*/
public class Circle {

    private double radius;

    /** Default constructor, needs to set the value to something */
    public Circle() {
        radius = 1; 
    }
    
    public Circle( double r ) {
        // Set the instance variable'
        radius = r;
    }

    public double diameter() {
        
        return radius*2; 
    }

    public double circumference() {
        return radius*2*Math.PI; 
    }

    public double area() {
        return Math.pow(radius,2)*Math.PI; 
    }
    
    /* Don't mess with the code below this point */
    public void setRadius(double r) { radius = r; }
    public double getRadius() { return radius; }
    public String toString() { return "Circle radius = " + radius; }
}