package lambda;

import java.util.TreeSet;

public class UsingComparator {
	
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>((x1,x2)->x1.compareTo(x2));
		t.add(23);
		t.add(12);
		t.add(1);
		t.forEach(x->System.out.println(x));
		
		
	}

}
