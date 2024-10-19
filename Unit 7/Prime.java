/*Assignment name: Prime or Not */
public class Prime {

    public static boolean isPrime( int num ) {
        int count = (int)Math.sqrt(num);
        for (int i=0;i<count+1;i++){
            if (i==0||i==1){
                continue;
            }else{
                if (num%i==0){
                    return false;
                }
            }
        }
        return true;
    }

}