package week10hwreview;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerVal=0;
				int guessValue=0; 
				int diceCount=1;
				String sAgain = "N"; 
				
				java.util.Scanner read = new java.util.Scanner (System.in);
		
		do{
			
			//repeat until the user is done pplaying 
			// read number of dices 
			System.out.println(" input number of dice to roll ");
			diceCount = read.nextInt(); 
			
			System.out.println ("what number are you guessing");
			guessValue= read.nextInt();
			
			Dice gameDice= new Dice(diceCount);
			computerVal = gameDice.Throw();
			
			
			if(guessValue==computerVal ){
				System.out.println("well done");
			}
			else{
				System.out.println("opps...sorry");
			}
			
			System.out.println("play again?");
			sAgain= read.nextLine();

			
			
		}while (sAgain.equalsIgnoreCase("Y"));
				
				
	}

}
