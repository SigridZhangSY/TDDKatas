
public class PrimeComposite {
	public boolean isPrime(int num){
		if(num == 1)
			return false;
		if(num == 2)
			return true;
		for(int i = 2; i < num; i++){
			if(num%i == 0)
				return false;
		}
		return true;
	}
	
	public boolean isEven(int num){
		if(num%2 == 0)
			return true;
		else
			return false;
	}
	
	public String printNumber(int num){
		if(isPrime(num)){
			return "prime";
		}
		else{
			if(num != 1 && !isEven(num))
				return "composite";
			else
				return String.valueOf(num);
		}
	}
	
	public String printRes(int n1, int n2) throws Exception{
		if(n1 <= 0 || n2 > 100 || n1 > n2)
			throw new Exception("INVALID PARAMETER");
		StringBuilder res = new StringBuilder();
		for(int i = n1; i <= n2; i++){
			res.append(printNumber(i) + " ");
		}
		return res.substring(0, res.length()-1);
	}
}
