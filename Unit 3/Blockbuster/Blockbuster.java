public class Blockbuster {    
    private String movie;
    private double cost;
    private int tickets;
    private double price;
    private double boxOffice;
    
    public Blockbuster(String m,double c){
        movie = m;
        cost = c;
    }
    
    public double getCost(){
        return cost;
    }
        
    public void setBoxOffice(int t,double p){
        tickets = t;
        price = p;
        boxOffice = t*p;
    }
    
    public double getNet(){
        return boxOffice-cost;
    }
    
    public double getBox(){
        return boxOffice;
    }
    public String getTitle(){
        return movie;
    }
    
    public double diff(Blockbuster movie2){
        return boxOffice-movie2.getBox();
    }
    
    public String toString(){
        
        return movie+"\ncost $"+(int)cost+"\ngrossed $"+Math.round(boxOffice)+"\nnet $"+Math.round(boxOffice-cost);
    }
}