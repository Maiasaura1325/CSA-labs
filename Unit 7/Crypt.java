/*Assignment name: Encryption */

public class Crypt{
    String encode;
    String decode;
    public Crypt(String encode, String decode){
        this.encode = encode;
        this.decode = decode;
    }
    
    public String encrypt(String message){
        String temp;
        String encoded="";
        String tempCoded;
        char tempChar;
        int location;
        int length = message.length();
        for (int i=0;i<length;i++){
            temp = message.substring(0,1);
            tempChar = message.charAt(0);
            message = message.substring(1);
            if (tempChar>64&&tempChar<97){
                location = encode.indexOf(temp);
                tempCoded = decode.substring(location,location+1);
                encoded+=tempCoded;
            }else{
                encoded+=temp;
            }
        }
        
        return encoded;
        //Use indexOf message to find it 
        //Special case: non-letter
        
    }
    
    public String decrypt(String message){
        String temp;
        String decoded="";
        String tempCoded;
        char tempChar;
        int location;
        int length = message.length();
        for (int i=0;i<length;i++){
            temp = message.substring(0,1);
            tempChar = message.charAt(0);
            message=message.substring(1);
            if (tempChar>64&&tempChar<97){
                location = decode.indexOf(temp);
                tempCoded = encode.substring(location,location+1);
                decoded+=tempCoded;
            }else{
                decoded+=temp;
            }
        }
        return decoded;
    }
}