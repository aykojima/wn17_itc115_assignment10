package roshamboApp;
import static roshamboApp.Roshambo.*;

public class Player1 extends Player {
	public Player1(String name){
		super();
		setName(name);
	}

	@Override
	public String generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String generateRoshambo(String x) {
		Roshambo roshambo = ROCK;				
		if(x.equalsIgnoreCase("r")){
			roshambo = ROCK;
		}else if(x.equalsIgnoreCase("p")){
			roshambo = PAPER;
		}else if (x.equalsIgnoreCase("s")){
			roshambo = SCISSORS;
		}
		return roshambo.toString();		
	}
}
