package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class UsingLambdaForEach {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(12);
		al.add(23);
		al.add(33);
		al.add(43);
		
		Consumer<Integer> c=x->System.out.println(x);
		al.forEach(c);
		System.out.println("======");
		al.forEach(x->System.out.println(x));
	}

}
