import java.util.ArrayList;

public class Concert{
    
    private String name;
    private String type;
    private String venue;
    private int capacity;
    //private Ticket[] tickets;
    private String date; 
    private final ArrayList <Concert>Concerts = new ArrayList<>();   

    public Concert() {
    	
    	this("no name", "no type", "no venue",0," no date");
    	Concerts.add(this);
    	
    }
    

    public Concert(String name, String type, String venue,int capacity,String date) {
       
        this.name = name;
    	this.type = type;
    	this.venue = venue;
    //	this.tickets = new Ticket[capacity];
    	this.capacity = capacity;
    	this.date = date;
    	
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
    
    public int getcapacity(){
    	
    	return capacity;
    }
    
    public String getdate(){
    	
    	return date;
    }
    
   /* public Ticket[] gettickets(){
    	
    	return tickets;
    }*/
    
    public void setname(String name){
    	
    	this.name = name;
    }
    
    public void settype(String type){
    	
    	this.type = type;
    }
    
    public void setvenue(String venue){
    	
    	this.venue = venue;
    }

    
  /*  public void settickets(Ticket[] tickets){
    	
    	this.tickets = tickets;
    }*/
    
    public void setcapacity(int capacity){
    	
    	this.capacity = capacity;
    }
    
    public void setdate(String date){
    	
    	this.date = date;
    }
    
    
    public String toString(){
 		String txt="";				
 			
 		if(Concerts==null){
 			
 			txt+="Sorry No Concerts avalible at the moment";
 		}				
 			
 		else{
 			for(int i = 0; i <= Concerts.size();i++){
 			
 			
 			txt+=Concerts.get(i);
 			}
 		}
 						
    	return ("Current concerts available:" + txt + ", \n");
    }
    
    
    
    
}