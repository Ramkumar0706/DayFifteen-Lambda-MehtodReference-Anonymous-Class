package anonymousObject;

import java.util.Comparator;
import java.util.TreeSet;

public class UsingComparator {
	
	public static void main(String[] args) {
		Comparator<Integer> c=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		TreeSet<Integer> t=new TreeSet<Integer>(c);
		t.add(23);
		t.add(32);
		t.add(12);
		t.add(4);
		t.forEach(x->System.out.println(x));
	}

}
