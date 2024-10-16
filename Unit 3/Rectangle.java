/*Assignment name: The Rectangle Class*/
public class Rectangle{
    private int width;
    private int height;
    
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    
    public int area(){
        return height*width;
    }
    
    public int perimeter(){
        return 2*(width+height);
    }
    
    public double diagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
    
    
}