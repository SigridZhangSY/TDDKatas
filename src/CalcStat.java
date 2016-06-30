
public class CalcStat {
	
	private int findMax(int[] numbers){
		int max = numbers[0];
		for(int number: numbers){
			if(number > max)
				max = number;
		}
		return max;
	}
	
	private int findMin(int[] numbers){
		int min = numbers[0];
		for(int number: numbers){
			if(number < min)
				min = number;
		}
		return min;
	}
	
	private int findNumber(int[] numbers){
		return numbers.length;
	}
	
	private float calcAve(int[] numbers){
		int sum = 0;
		for(int number: numbers){
			sum += number;
		}
		
		return (float)sum/numbers.length;
		
	}
	
	public String printRes(int[] numbers){
		return String.valueOf(findMax(numbers)) + " " + String.valueOf(findMin(numbers)) + " " + String.valueOf(findNumber(numbers)) + " " + String.valueOf(calcAve(numbers));
	}
}
