
public class BowlingGame {
	private int[] rolls = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins){
		rolls[currentRoll++] = pins;
	}
	
	public boolean isSpare(int indexFrame){
		if(rolls[indexFrame] + rolls[indexFrame+1] == 10)
			return true;
		else
			return false;
	}
	
	private int bonusOfSpare(int indexFrame){
		return rolls[indexFrame+2];
	}
	
	private boolean isStrike(int indexFrame){
		if(rolls[indexFrame] == 10)
			return true;
		else
			return false;
	}

	private int bonusOfStrike(int indexFrame){
		return rolls[indexFrame+1] + rolls[indexFrame+2];
	}
	
	public int score(){
		int score = 0;
		int indexFrame = 0;
		for(int frame = 0; frame < 10; frame++){
			if(isStrike(indexFrame)){
				score += 10 + bonusOfStrike(indexFrame);
				indexFrame ++;
			}else if(isSpare(indexFrame)){
					score += 10 + bonusOfSpare(indexFrame);;
					indexFrame += 2;
			}else {
					score += rolls[indexFrame] + rolls[indexFrame+1];
					indexFrame += 2;
			}
		}
		/*score += rolls[indexFrame] + rolls[indexFrame+1];
		if(isStrike(indexFrame) || isSpare(indexFrame))
			score += rolls[indexFrame+2];*/
		return score;
	}
}
