/*Assignment name: Distance Formula*/
import java.util.*;
import static java.lang.System.*;
import java.lang.Math.*;
public class DistanceFormula{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        out.println("Enter x1:");
        int x1 = scan.nextInt();
        scan.nextLine();
        out.println("Enter y1:");
        int y1 = scan.nextInt();
        scan.nextLine();
        
        out.println("Enter x2:");
        int x2 = scan.nextInt();
        scan.nextLine();
        out.println("Enter y2:");
        int y2 = scan.nextInt();
        
        
        out.println("(x1,y1) is ("+x1+","+y1+")");
        out.println("(x2,y2) is ("+x2+","+y2+")");
        
        double xDistance = Math.pow((double)x1-(double)x2,2);
        double yDistance = Math.pow((double)y1-(double)y2,2);
        double distance = Math.pow(xDistance+yDistance, 0.5);
        
        out.printf("The distance between the two points are %.3f", distance);
        
    }
}