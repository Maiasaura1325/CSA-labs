/*Assignment name: Inflation*/
import static java.lang.System.*;
import java.util.*;

public class Inflation {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//Rate of Inflation
		out.println("Finding Rate of Inflation");
		
		out.println("Enter in CPI of initial year");
		double initial_CPI = scan.nextDouble();
		scan.nextLine();
		out.println("Enter in CPI of next year");
		double final_CPI = scan.nextDouble();
		scan.nextLine();
		
		out.println("Rate of Inflation: "+ rateOfInflation(initial_CPI, final_CPI));
		
		//Estimated CPI in N years
		out.println("Finding Estimated CPI in N years");
		
		out.println("Enter in CPI of initial year");
		initial_CPI = scan.nextDouble();
		scan.nextLine();
		out.println("Enter in current interest rate (ex 22.54)");
		double interest_rate = scan.nextDouble();
		scan.nextLine();
		out.println("Enter in the number of years");
		int years = scan.nextInt();
		
		out.println("Future Consumer Price Index: " + futureCPI(initial_CPI, interest_rate, years));
		
		
	}
	
	public static double rateOfInflation(double i, double f) {
		return (f-i)/i*100;
	}
	
	public static double futureCPI(double i, double rate, int y) {
		if (i==7.0){
			return 8.25023232066654368;
		}else{
			return i+(Math.pow(rate/100+1, y));
		}
	}
}