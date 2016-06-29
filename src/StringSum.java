
public class StringSum {
	public int convertNum(String str){
		int res = 0;
		if(str == "" || str == null)
			return res;
		
		if(str.charAt(0) == '+')
			str = str.substring(1, str.length());
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) < '0' || str.charAt(i) > '9')
				return res;
		}
		
		res = Integer.valueOf(str); 
		
		return res;
	}
	
	public String sum(String num1, String num2){
		int n1 = convertNum(num1);
		int n2 = convertNum(num2);
		
		return String.valueOf(n1 + n2);
	}
}
