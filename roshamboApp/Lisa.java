package roshamboApp;
import static roshamboApp.Roshambo.*;

public class Lisa extends Player {
	public Lisa(){
		super();
		name = "Lisa";
		setName(name);
	}
	//randomly select rock, paper, or scissors (a 1 in 3 chance of each).
	@Override
	public String generateRoshambo(){
		Roshambo roshambo = ROCK;
		int i = (int)(Math.random() * 3);		
		if(i == 0){
			roshambo = ROCK;
		}else if(i == 1){
			roshambo = PAPER;
		}else if (i == 2){
			roshambo = SCISSORS;
		}
		return roshambo.toString();
	}
	@Override
	public String generateRoshambo(String x) {
		// TODO Auto-generated method stub
		return null;
	}
}
