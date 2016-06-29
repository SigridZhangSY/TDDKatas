
public class FizzBuzz {
	public String printNumber(){
		StringBuilder res = new StringBuilder();
		for(int i = 1; i <= 100; i++){
			if(i%3 == 0 && i%5 ==0)
				res.append("FizzBuzz" + " ");
			else if(i%3 == 0)
					res.append("Fizz" + " ");
				else if (i%5 == 0)
						res.append("Buzz" + " ");
					else 
						res.append(String.valueOf(i) + " ");
		}
		return res.substring(0,res.length()-1);
	}
}
