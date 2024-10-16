/*Assignment name: Case Specific*/
import static java.lang.System.*;
import java.util.*;
public class CaseSpecific{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        out.println("Enter line 1:\n");
        String line1 = scan.nextLine();
        
        out.println("Enter line 2:\n");
        String line2 = scan.nextLine();
        
        out.println("line 1:"+line1);
        out.println("line 2:"+line2);
       
        boolean same;
        same = (line1.toLowerCase()).equals(line2.toLowerCase());
        out.println("They are the same? "+same);
        
        out.println("line 1:"+clearLine(line1));
        out.println("line 2:"+clearLine(line2));
        
        
        
    }
    
    public static String clearLine(String line){
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (String v : vowels){
            line = line.replace(v,"");
        }
        return line;
    }
    
    public static String clearLine2(String line){
        line = line.replace("a", "");
        line = line.replace("e", "");
        line = line.replace("i", "");
        line = line.replace("o", "");
        line = line.replace("u", "");
        line = line.replace("A", "");
        line = line.replace("E", "");
        line = line.replace("I", "");
        line = line.replace("O", "");
        line = line.replace("U", "");
        
        return line;
    }
    
    public static String clearLine3(String line){
        for(int i=0; i<line.length();i++){
            switch(line.charAt(i)){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U': line=line.replace(""+line.charAt(i), "0"); break;
                default: break;
            }
        }
        line=line.replace("0","");
        
        return line;
    }
}