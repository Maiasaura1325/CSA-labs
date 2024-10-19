/*This is for the FrogSimulation file */
import java.util.Random;

public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	private Random rand;
	
	public FrogSimulation(int dist, int numHops, int seed)
	{
		goalDistance = dist;
		maxHops = numHops;
		rand = new Random(seed);
	}
	
	public int hopDistance()
	{
		int x = rand.nextInt(goalDistance/maxHops*4);
		if(rand.nextInt(5) == 0)
			x = -x;
		return x;
	}
	
	public boolean simulate()
	{
		// Write Code here
		int hops = 0;
		int distance = 0;
		while (hops<maxHops){
		    distance+=hopDistance();
		    if (distance<0){
		        return false;
		    }else if(distance>=goalDistance){
		        return true;
		    }else{
		        hops+=1;
		        continue;
		    }
		}
		return false;
	}
	
	public double runSimulations(int num)
	{
		double successCount=0;
		boolean success;
		for (int i=0;i<num;i++){
		    success = simulate();
		    if (success){
		        successCount+=1;
		    }
		}
		return successCount/num;
	}
}