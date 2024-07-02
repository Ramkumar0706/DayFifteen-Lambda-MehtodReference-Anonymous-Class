package methodReference;

import java.util.Arrays;
import java.util.List;

public class Example {
	
	public static void main(String[] args) {
		List<String> l=Arrays.asList("ram","tom","sam");
		l.forEach(System.out::println);
	}

}
