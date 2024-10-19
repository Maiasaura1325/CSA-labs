/*Assigment name: Biggest & Smallest */

public class BiggestSmallest {

    public int biggestDigit( int num ) {
        
        // When you're looking for the biggest, start with something really small
        int biggest = 0; 
        int digit=0;
        
        // You're probably going to need a loop
        // with an if inside
        //*********************************
        int digitCount = String.valueOf(num).toString().length();
        for (int i=0; i<digitCount; i++){
            digit = num%10;
            num/=10;
            if (digit>biggest){
                biggest=digit;
            }
            if (biggest==9){
                break;
            }
        }
        
        return biggest; 
    }

    public int smallestDigit( int num ) {

        // Looking for small, start with really big
        int smallest = 10; 
        int digit=0;
        
        // And this will look a lot like biggestDigit
        int digitCount = String.valueOf(num).length();
        for (int i=0; i<digitCount; i++){
            digit = num%10;
            num/=10;
            if (digit<smallest){
                smallest=digit;
            }
            if (smallest==0){
                break;
            }
        }
        
        return smallest; 
        
    }

}
