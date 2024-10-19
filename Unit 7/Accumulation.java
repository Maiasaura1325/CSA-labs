/*Assignment name: Accumulation */
import static java.lang.System.*;
import java.util.*;

public class Accumulation{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        out.println("HOW MANY INTEGERS WILL BE ADDED:");
        int count = input.nextInt();
        
        int sum = 0;
        int addend;
        for (int i=0; i<count; i++){
            out.println("ENTER AN INTEGER:");
            addend = input.nextInt();
            sum+=addend;
        }
        out.println("THE SUM IS "+sum);
    }
}