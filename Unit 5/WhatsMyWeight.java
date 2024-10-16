/*Assignment name: What's My Weight*/
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class WhatsMyWeight {
	public static void main(String[] args) {
		Scanner input = new Scanner(in);
		int choice;
		double weight, newWeight;
		String planet;
		
		out.println("Enter weight:");
		weight = input.nextDouble();
		out.println("\t\tMenu\n1.\tVoltar\n2.\tKrypton\n3.\tFertos\n4.\tPlanet X\n\tYour Selection:");
		choice=input.nextInt();
		planet = getPlanet(choice);
		if(planet.equals("Not a valid option")) 
		{
			out.println(planet);
			return;
		}
		newWeight = getWeight(planet, weight);
		out.println(weight+" on "+planet+" is converted to "+String.format("%.3f",newWeight));			
	}

	// first method goes here
	public static String getPlanet(int choice){
	    switch(choice){
	        case 1: return "Voltar";
	        case 2: return "Krypton";
	        case 3: return "Fertos";
	        case 4: return "Planet X";
	        default: return "Not a valid option";
	    }
	}
	
	// second method goes here
	public static double getWeight(String planet, double weight){
	    switch (planet){
	        case "Voltar": return weight*0.158;
	        case "Krypton": return weight*0.846;
	        case "Fertos": return weight*1.269;
	        case "Planet X": return weight*0.020;
	        default: return weight;
	    }
	}
}