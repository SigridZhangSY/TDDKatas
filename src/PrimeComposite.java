import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringCalculator {
	
	private int addSum(String[] numbers) throws Exception{
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
	
	private boolean isSpecified(String str){
		if(str.charAt(0) >= '0' && str.charAt(0) <= '9')
			return false;
		else
			return true;
			
	}
	
	private String getSpecified(String delimiterStr){
		if(delimiterStr.length() == 1)
			return delimiterStr;
		else{
			String regex = "(?<=\\[)([^\\]])*?(?=\\])";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(delimiterStr);
			StringBuilder res = new StringBuilder();
			while(m.find()){
				String regxRes = new String();
				regxRes = m.group();
				//replace "\" first
				regxRes = regxRes.replaceAll("\\\\", "\\\\\\+");
				regxRes = regxRes.replaceAll("\\*", "\\\\*");
				regxRes = regxRes.replaceAll("\\+", "\\\\+");
				regxRes = regxRes.replaceAll("\\|", "\\\\|");
				res.append(regxRes + "|");

			}
			if(res.length() > 0)
				return res.substring(0, res.length()-1);
			else
				return null;
		}
			
	}
	
	public int getRes(String str) throws Exception{
		String delimiters;
		String[] numbers;
		if(str == "" || str == null)
			return 0;
		if(isSpecified(str)){
			String[] resSplit = str.split("\n");
			delimiters = getSpecified(resSplit[0]);
			numbers = resSplit[1].split(delimiters);
		}
		else
			 numbers = str.split(",|\n");
		
		return addSum(numbers);
	}
	
	

}
