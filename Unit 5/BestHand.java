/*Assignment name: Best Blackjack Hand*/
public int bestHand(int a, int b, int c) {
    int restOfHand;
    if ((a+b+c)>21){
        return -1;
    }else{   
        if (a==1){
            restOfHand = b+c;
            if (restOfHand < 11){
                return restOfHand + 11;
            }else{
                return restOfHand + 1;
            }
        }else if (b==1){
            restOfHand = a+c;
            if (restOfHand < 11){
                return restOfHand + 11;
            }else{
                return restOfHand + 1;
            }
        }else if (c==1){
            restOfHand = a+b;
            if (restOfHand < 11){
                return restOfHand + 11;
            }else{
                return restOfHand + 1;
            }
        }else{
            return a+b+c;
        }
    }
}