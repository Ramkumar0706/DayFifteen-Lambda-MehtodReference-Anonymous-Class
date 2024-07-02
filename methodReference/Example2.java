package methodReference;

interface ParserExmaple{
	public int convert(String str);
}


class NumberConvert{
	public int StringToNumber(String str) {
		return Integer.parseInt(str);
	}
	
	public int number(String st,ParserExmaple p) {
		int convert = p.convert(st);
		
		return convert;
		
	}
}

public class Example2 {
	
	public static void main(String[] args) {
		
		ParserExmaple p=new NumberConvert()::StringToNumber;
		System.out.println(p.convert("123"));
		
		int number = new NumberConvert().number("234", p);
	System.out.println(number);
		
		
	}

}
