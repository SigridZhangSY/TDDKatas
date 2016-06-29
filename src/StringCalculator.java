
public class StringCalculator {
	
	public int addSum(String[] numbers) throws Exception{
		int sum = 0;
		StringBuilder negativeNum = new StringBuilder();
		for(String num : numbers){
			if(Integer.valueOf(num) >= 0){
				if(Integer.valueOf(num) <= 1000 )
					sum += Integer.valueOf(num);
			}
			else
				negativeNum.append(num + ",");
		}
		if(negativeNum.length() > 0)
			throw new Exception("negatives not allowed - " + negativeNum.substring(0, negativeNum.length()-1));
		
		return sum;
	}
	
	public boolean isSpecified(String str){
		if(str.charAt(0) >= '0' && str.charAt(0) <= '9')
			return false;
		else
			return true;
			
	}
	
	public int getRes(String str) throws Exception{
		String delimiters;
		String[] numbers;
		if(str == "" || str == null)
			return 0;
		if(isSpecified(str)){
			delimiters = str.substring(0,1);
			str = str.substring(2,str.length());
			numbers = str.split(delimiters);
		}
		else
			 numbers = str.split(",|\n");
		
		return addSum(numbers);
	}
	
	

}
