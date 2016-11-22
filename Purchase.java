public class Purchase{
        
	private String ConcertName;
	private int quantity;
	
    public Purchase() {
    	this("No concert", 0);
    }
    

    public Purchase(String ConcertName, int quantity){
    	
        this.ConcertName = ConcertName;
        this.quantity = quantity;
    }
    
    public void setConcertName(String ConcertName){
    	
    	this.ConcertName = ConcertName;
    }
    
    public void setquantity(int quantity){
    	
    	this.quantity = quantity;
    }
    
    public String getConcertName(){
    	
    	return ConcertName;
    }
    
    public int getquantity(){
    	
    	return quantity;
    }
    
   public String toString(){
   	
   	return ("Concert name: " + getConcertName() + "Number of tickets: " + getquantity());
   }
}