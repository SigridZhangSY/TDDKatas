import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExpression{
	
	public String printRes(String str){
		String regex = "(?<=\\[).*(?=\\])";
		//String regex = "\\d+";
		//String regex = "[^\\[\\]]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		StringBuilder res = new StringBuilder();
		while(m.find()){
			return m.group(0);
		}
			return "not find";
		//return m.group();
	}
	
	
	public static void main(){
		String str = "[abc]113";
		//String regex = "(?<=\\[).*(?=\\])";
		String regex = "\\d*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		System.out.println(m.group());
	}
}
