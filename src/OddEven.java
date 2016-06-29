
public class OddEven {
	public Boolean isPrime(int num) {
		if(num == 2)
			return true;
		if(num%2 == 0)
			return false;
		if(num == 1)
			return false;
		for(int i = 3; i < num; i += 2){
			if(num%i == 0)
				return false;
		}
		return true;
		
	}
	
	public Boolean isEven(int num){
		if(num%2 == 0)
			return true;
		return false;
	}	
	
	public String printNumber(int num){
		if(isPrime(num))
			return String.valueOf(num);
		
		if(isEven(num))
			return "Even";

		return "Odd";

			
	}
	
	public String printRes(int num1, int num2){
		if(num1 < 1 || num2 > 10 || num1 > num2){
			return "INVALID PARAMETER!";
		}
		StringBuilder res = new StringBuilder();
		for(int i = num1; i <= num2; i++){
			res.append(printNumber(i)+' ');
		}
		return res.substring(0, res.length()-1);
		
	}

}

