//import java.util.ArrayList;

public class Concert{
    
    private String name;
    private String type;
    private String venue;
    private String tickets; 
//    private static ArrayList <Concert>Concerts = new ArrayList<Concert>();   

    public Concert() {
    	
    	this("no name", "no type", "no venue", "no tickets");
//    	Concerts.add(this);
    	
    }
    

    public Concert(String name, String type, String venue, String tickets) {
       
        this.name = name;
    	this.type = type;
    	this.venue = venue;
    	this.tickets = tickets;
    }
    
    public String getname(){
    	
    	return name;
    }
    
    public String gettype(){
    	
    	return type;
    }
    
    public String getvenue(){
    	
    	return venue;
    }
    
    public String gettickets(){
    	
    	return tickets;
    }
    
    public void setname(String name){
    	
    	this.name = name;
    }
    
    public void settype(String type){
    	
    	this.type = type;
    }
    
    public void setvenue(String venue){
    	
    	this.venue = venue;
    }

    
    public void settickets(String tickets){
    	
    	this.tickets = tickets;
    }
    
    
    public String toString(){
    	
    	return ("Concert name: " + getname() + "\tConcert type: " + gettype() + "\tConcert venue: " + getvenue() +
    			"\tConcert tickets: " + gettickets());
    }
    
    
    
    
}