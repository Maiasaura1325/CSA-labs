/*Assignment name: Extremes */

import static java.lang.System.*;
import java.util.*;

public class Extremes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        out.println("Enter the number of random values you want:");
        int count = input.nextInt();
        
        out.println("Enter the smallest value:");
        int x = input.nextInt();
        out.println("Enter the largest value:");
        int y = input.nextInt();
        
        int temp=0;
        int largest=x;
        int smallest=y;
        
        for(int i=0;i<count;i++){
            temp = input.nextInt();
            if (temp>largest){
                largest=temp;
            }else if (temp<smallest){
                smallest=temp;
            }else{
                continue;
            }
        }
        out.println("The largest number is: "+largest);
        out.println("The smallest number is: "+smallest);
    }
}