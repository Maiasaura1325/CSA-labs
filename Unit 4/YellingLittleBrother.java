/*Assignment name: Yelling Little Brother*/
public class YellingLittleBrother{
    public static String yellingBrother(String message){
        String firstLetter = message.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        message = (message.substring(1,message.length()-1)).toLowerCase();
        message = firstLetter+message;
        
        message = message+".";
        return message;
    }
}