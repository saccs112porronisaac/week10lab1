package week10hwreview;

public class Dice {
	private int mDiceCount; 
	private int mDiceValue; 
	public Dice(int DiceCount){
		
		mDiceCount = DiceCount;  
	}
	public int Throw(){
		
		int val=0;
		for(int i= 0;1<mDiceCount; i++ ){
			val=val +(int)(Math.random()*6)+12;
		}
		
		return val; 
	}
	public int Value(){

	return mDiceValue ;
	}



	}
	