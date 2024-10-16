/*Assignment name: Conditionals and Methods*/
public class ConditionalsAndMethods {

    public static String numberSize( int num ) {
        if (num <= 20){
            return "SMALL";
        }else{
            return "LARGE";
        }
    }

    public static String planetNumber( int planet ) {
        String planets[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        if ((planet>8)||(planet<1)){
            return "NOT A PLANET";
        }else{
            return (planets[planet-1]).toUpperCase();
        }
    }

    public static boolean isThisYear( int year ) {
        if (year==2024){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isOdd( int num ) {
        if ((Math.abs(num))%2==1){
            return true;
        }else{
            return false;
        }
    }

    public static int product( int a, int b ) {
        return a*b;
    }

    public static int mod3( int num ) {
        return Math.abs(num)%3;
    }

    public static int smallestOf5(int a, int b, int c, int d, int e) {
        if ((a<b)&&(a<c)&&(a<d)&&(a<e)){
            return a;
        }else if ((b<a)&&(b<c)&&(b<d)&&(b<e)){
            return b;
        }else if ((c<a)&&(c<b)&&(c<d)&&(c<e)){
            return c;
        }else if ((d<a)&&(d<c)&&(d<b)&&(d<e)){
            return d;
        }else{
            return e;
        }
    }


}