
public class Stringconversion {
	public static long stringTolong(String s){
		int index = 0;
		char first = s.charAt(0);
		boolean isNeg = false;
		if(first == '+' || first == '-'){
			if(first == '-')
				isNeg = true;
			index++;
		}
		long res = 0;
		for(; index < s.length(); index++){
			char temp = s.charAt(index);
				int num = temp - '0';
				res = res*10 + num;
		}
		return isNeg? -res: res;
	}
	public static void main(String[]args){
		System.out.println(Stringconversion.stringTolong("1234"));
		System.out.println(Stringconversion.stringTolong("-1234"));
		System.out.println(Stringconversion.stringTolong("+1234"));
		System.out.println(Stringconversion.stringTolong("1234"));
		System.out.println(Stringconversion.stringTolong("1234A"));
		System.out.println(Stringconversion.stringTolong("1234."));
		
		
//		System.out.println(Stringconversion.stringTolong("12341111111111111111111111"));
		
		
		
	}
}
