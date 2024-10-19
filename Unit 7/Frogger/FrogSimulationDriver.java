/*This is for the FrogSimulationDriver file */
import static java.lang.System.*;
import java.util.Scanner;

public class FrogSimulationDriver {
	public static void main(String args[])
	{
	    // more code will be needed in this method
		int numSim;
		double pct;
		Scanner input = new Scanner(System.in);
		
		out.println("Enter distance");
		int distance = input.nextInt();
		out.println("Enter maximum number of hops");
		int maxHops = input.nextInt();
		out.println("Enter the random seed value");
		int seed = input.nextInt();
		out.println("Enter the number of simulations");
		numSim = input.nextInt();
		
		FrogSimulation frogSim = new FrogSimulation(distance, maxHops, seed);
		//runSimulations
		pct = frogSim.runSimulations(numSim);
		
		out.println("After "+numSim+" simulations, the frog succeeds "+pct+" of the time.");
	}
}