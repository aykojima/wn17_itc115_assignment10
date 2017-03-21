package roshamboApp;
import java.util.Scanner;

public class RoshamboApp {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		//Greet the user
		displayLine("Welcome to the game of Roshambo");
		String user = getString("Enter your name: ");
		//instantiate player1
		Player1 player1 = new Player1(user);
		String computer = getString("Would you like to play Bart or Lisa? (b/l): ");				
		String move = "";
		String choice = "y";		
		
								
			while(choice.equalsIgnoreCase("y")){
				move = getString("Rock, paper, or scissors? (r/p/s): ");											
				String validMove = "n";
				while(validMove.equals("n"))
				{//check if the user input is valid
					if(!checkMove(move)){
						move = getString("Invalid move\nRock, paper, or scissors? (r/p/s): ");
					}else{
						validMove = "y";
					}//end of if(checkMove)
				}//end of while (validMove)
				
				
				//select Bart ----------------------------------------------------------
				if(computer.equalsIgnoreCase("b")){			
					Bart bart = new Bart();
					displayLine(playRoshambo(player1.generateRoshambo(move), bart.generateRoshambo(), user, bart.getName()));
				}else if(computer.equalsIgnoreCase("l")){
				//select Lisa ----------------------------------------------------------	
					Lisa lisa = new Lisa();
					displayLine(playRoshambo(player1.generateRoshambo(move), lisa.generateRoshambo(), user, lisa.getName()));
				}
	            //ask the user to play again
	            choice = getString("Play again? (y/n):");
			}//end of while loop
			sc.close();	
		}			
	
	
	
	public static boolean checkMove(String move)
    {
        if(move.equalsIgnoreCase("r") || move.equalsIgnoreCase("p") ||
        		move.equalsIgnoreCase("s") ){          
            return true;
        }
        return false;
    }
	
	
	
	public static boolean isWinner(String moveA, String moveB)
    {
        if(moveA.equals("rock") && moveB.equals("scissors") ||
            moveA.equals("paper") && moveB.equals("rock") ||
            moveA.equals("scissors") && moveB.equals("paper"))
        {          
            return true;
        }
        return false;
    }
	
	
	
	public static String displayWinner(String player1Move, String player2Move, String player1Name, String player2Name)
	{
		String result = "";
	if(isWinner(player1Move, player2Move))
    {
		result = player1Name + " wins!";
        
    }else if (isWinner(player2Move, player1Move)){
    	result = player2Name + " wins!";
      
    }else {
    	result = "Draw!";
    }
	return result;
	}
	
	
	
	public static String playRoshambo(String move1, String move2, String userName, String computerName)
	{
		String player1Move = move1;//player1.generateRoshambo(move);
		String computerMove = move2;//bart.generateRoshambo();
		//display the results
		String results = userName + ": " + player1Move + "\n" + computerName + ": " + computerMove + 
				"\n" + displayWinner(player1Move, computerMove, userName, computerName);
		return  results;
	}
	
	//console from Ch8
	 public static void displayLine() {
	        System.out.println("Welcome to the Account Calculator");
	    }

	    public static void displayLine(String s) {
	        System.out.println(s);
	    }

	    public static String getString(String prompt) {
	        System.out.print(prompt);
	        String s = sc.nextLine();
	        return s;
	    }

	  /*  public static int getInt(String prompt) {
	        int i = 0;
	        while (true) {
	            System.out.print(prompt);
	            try {
	                i = Integer.parseInt(sc.nextLine());
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("Error! Invalid integer. Try again.");
	            }
	        }
	        return i;
	    }

	    public static double getDouble(String prompt) {
	        double d = 0;
	        while (true) {
	            System.out.print(prompt);
	            try {
	                d = Double.parseDouble(sc.nextLine());
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("Error! Invalid decimal. Try again.");
	            }
	        }
	        return d;
	    } */
	}



