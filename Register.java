import java.util.ArrayList;

public class Register{
	
	private String name;
	private String DOB;
	private String address;    

    public Register() {
    	this("No name", "None", "0");
    }

    public Register(String name, String DOB, String address) {
        
        this.name = name;
        this.DOB = DOB;
        this.address = address;
    }
    
    public void setname(String name){
    	
    	this.name = name;
    }
    
    public void setDOB(String DOB){
    	
    	this.DOB = DOB;
    }
    
    public void setage(String address){
    	
    	this.address = address;
    }
    
    public String getname(){
    	
    	return name;
    }
    
    public String getDOB(){
    	
    	return DOB;
    }
    
    public String getaddress(){
    	
    	return address;
    }
    
    public String toString(){
    	
    	return (" Your name is: " + getname() + " Your Date of birth is: " + getDOB() + " Your address is: " + getaddress());
    }
}