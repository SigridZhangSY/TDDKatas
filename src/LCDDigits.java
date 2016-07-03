
public class LCDDigits {
	/*String[] LCD_0 = {"._.", "|.|", "|_|"};
	String[] LCD_1 = {"...", "..|", "..|"};
	String[] LCD_2 = {"._.", "._|", "|_."};
	String[] LCD_3 = {"._.", "._|", "._|"};
	String[] LCD_4 = {"...", "|_|", "..|"};
	String[] LCD_5 = {"._.", "|_.", "._|"};
	String[] LCD_6 = {"._.", "|_.", "|_|"};
	String[] LCD_7 = {"._.", "..|", "..|"};
	String[] LCD_8 = {"._.", "|_|", "|_|"};
	String[] LCD_9 = {"._.", "|_|", "..|"};*/
	
	String[][] ShowLCD = {{"._.", "|.|", "|_|"},
						{"...", "..|", "..|"},
						{"._.", "._|", "|_."},
						{"._.", "._|", "._|"},
						{"...", "|_|", "..|"},
						{"._.", "|_.", "._|"},
						{"._.", "|_.", "|_|"},
						{"._.", "..|", "..|"},
						{"._.", "|_|", "|_|"},
						{"._.", "|_|", "..|"}};
	
	private int getDigits(int num){
		return String.valueOf(num).length();
	}
	private int getOneNumber(int num, int digit){
		String numString = String.valueOf(num).substring(digit, digit+1);
		return  Integer.valueOf(numString);
	}
	
	public String printNumber(int num){
		StringBuilder LCDNumber = new StringBuilder();
		
		int digits = getDigits(num);
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < digits; j++){
				LCDNumber.append(ShowLCD[getOneNumber(num, j)][i]);
				if(j == digits-1)
					LCDNumber.append('\n');
				else
					LCDNumber.append(' ');
			}
		}
		
		return LCDNumber.substring(0, LCDNumber.length()-1);
	}
}
