package roshamboApp;

public abstract class Player {
	String roshambo;
	protected String name;
	//private String roshambo;
	public Player(){
		
	}
	//stores a name and a Roshambo value
	
	//an abstract method named generateRoshambo 
	public abstract String generateRoshambo();
	//This method allows an inheriting class to generate and return a Roshambo value
	
	public abstract String generateRoshambo(String x);
	
	public String getName(){
		return name;
	}	
	//set method for the name.
	public void setName(String name){
		this.name = name;
	}
	//get
	public String getRoshambo(){
		return roshambo;
	}	
	//set method for the Roshambo value.
	public void setRoshambo(String roshambo){
		this.roshambo = roshambo;
	}
}
