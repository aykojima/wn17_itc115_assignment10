package roshamboApp;

public class Bart extends Player{
	
	public Bart(){
		super();
		name = "Bart";
		setName(name);
	}
	//inherit the Player class and implement the generateRoshambo method
	@Override
	public String generateRoshambo(){
		Roshambo roshambo = Roshambo.ROCK;		
		return roshambo.toString();
	}
	//alwasy select rock
	@Override
	public String generateRoshambo(String x) {
		// TODO Auto-generated method stub
		return null;
	}
}
