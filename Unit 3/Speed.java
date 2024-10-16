/*Assignment name: The Speed of Sound*/
import static java.lang.System.*;
import java.util.*;

public class Speed{
    
    
    
    public static double calculateDistance(int seconds){
        return seconds*0.21313;
    }
    public static void main(String args[]){
        int seconds;
        double distance;
        Scanner scan = new Scanner(System.in);
        out.println("Enter the number of seconds");
        seconds = scan.nextInt();
        out.printf("%.3f",calculateDistance(seconds));
    }
    
}