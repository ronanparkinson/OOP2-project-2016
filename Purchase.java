public class Purchase{
        
	private String ConcertName;
	private String quantity;

	
    public Purchase() {
    	this("No concert" ,"0");
    }
    

    public Purchase(String ConcertName, String quantity){
    	
        this.ConcertName = ConcertName;
        this.quantity = quantity;
    }
    
    public void setConcertName(String ConcertName){
    	
    	this.ConcertName = ConcertName;
    }
    
    public void setquantity(String quantity){
    	
    	this.quantity = quantity;
    }
    
    public String getConcertName(){
    	
    	return ConcertName;
    }
    
    public String getquantity(){
    	
    	return quantity;
    }
    
   public String toString(){
   	
   	return (" Concert name: " + getConcertName() + " Number of tickets: " + getquantity());
   }
}