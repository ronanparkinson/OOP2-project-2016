public class Concert{

    /**
     * These are all of the attributes being created in to class
     */

    private String name;
    private String type;
    private String venue;
    private String capacity;
    private String date;


    /**
     * These is the default method to give the attributes their values
     */
    public Concert() {
    	
    	this("no name", "no type", "no venue","0"," no date");
    }


    public Concert(String name, String type, String venue,String capacity,String date) {
       	
        this.name = name;
    	this.type = type;
    	this.venue = venue;
    	this.capacity = capacity;
    	this.date = date;

    }

    /**
     * This return the name of the concert when requested
     * @return
     */
    public String getname(){
    	
    	return name;
    }

    /**
     * This returns the concert music type
     * @return
     */
    public String gettype(){

    	return type;
    }

    /**
     * Thsi returns the concert venue
     * @return
     */
    public String getvenue(){

    	return venue;
    }

    /**
     * This returns the concert capacity
     * @return
     */
    public String getcapacity(){

    	return capacity;
    }

    /**
     * This returns the concert date when requested
     * @return
     */
    public String getdate(){
    	
    	return date;
    }

    /**
     * Gives variable 'name' a new value
     * @param name
     */
    public void setname(String name){
    	
    	this.name = name;
    }

    /**
     * Gives variable 'type' a new value
     * @param type
     */
    public void settype(String type){

    	this.type = type;
    }

    /**
     * Gives variable 'venue' a new value
     * @param venue
     */
    public void setvenue(String venue){

    	this.venue = venue;
    }

    /**
     * Gives variable 'capacity' a new value
     * @param capacity
     */
    public void setcapacity(String capacity){

    	this.capacity = capacity;
    }

    /**
     * Gives variable 'date' a new value
     * @param date
     */
    public void setdate(String date){
    	
    	this.date = date;
    }

    /**
     * This returns the accessor methods to the main class
      * @return
     */
    public String toString(){

    	return ("Concert name: " + getname() + " Concert date: " + getdate());
    	
    }
    
    
    
    
}