/*Assignment name: Average Daily Attendance*/
import java.util.*;
import static java.lang.System.*;

public class AverageDailyAttendance{
    public static void main(String args[]){
        //set up scanner
        Scanner scan = new Scanner(System.in);
        
        //get all info
        out.println("Please enter number of 9th graders enrolled:");
        double enrolled9 = scan.nextDouble();
        out.println("Please enter number of 9th graders absent:");
        double absent9 = scan.nextDouble();
        
        out.println("Please enter number of 10th graders enrolled:");
        double enrolled10 = scan.nextDouble();
        out.println("Please enter number of 10th graders absent:");
        double absent10 = scan.nextDouble();
        
        out.println("Please enter number of 11th graders enrolled:");
        double enrolled11 = scan.nextDouble();
        out.println("Please enter number of 11th graders absent:");
        double absent11 = scan.nextDouble();
        
        out.println("Please enter number of 12th graders enrolled:");
        double enrolled12 = scan.nextDouble();
        out.println("Please enter number of 12th graders absent:");
        double absent12 = scan.nextDouble();
        
        //start calculations
        double present9 = (1-absent9/enrolled9)*100;
        double present10 = (1-absent10/enrolled10)*100;
        double present11 = (1-absent11/enrolled11)*100;
        double present12 = (1-absent12/enrolled12)*100;
        
        System.out.println( String.format("%.3f",present9)+"% PRESENT IN GRADE 9");
        System.out.println( String.format("%.3f",present10)+"% PRESENT IN GRADE 10");
        System.out.println( String.format("%.3f",present11)+"% PRESENT IN GRADE 11");
        System.out.println( String.format("%.3f",present12)+"% PRESENT IN GRADE 12");
        
        
    }
}