public class Register{
	
	private String name;
	private String DOB;
	private int age;
        

    public Register() {
    	this("No name", "None", 0);
    }

    public Register(String name, String DOB, int age) {
        
        this.name = name;
        this.DOB = DOB;
        this.age = age;
    }
    
    public void setname(String name){
    	
    	this.name = name;
    }
    
    public void setDOB(String DOB){
    	
    	this.DOB = DOB;
    }
    
    public void setage(int age){
    	
    	this.age = age;
    }
    
    public String getname(){
    	
    	return name;
    }
    
    public String getDOB(){
    	
    	return DOB;
    }
    
    public int getage(){
    	
    	return age;
    }
    
    public String toString(){
    	
    	return ("Your name is: " + getname() + "Your Date of birth is: " + getDOB() + "Your age is: " + getage());
    }
}