package lambda;
@FunctionalInterface
interface Persons{
	String speak(String name);
	
}

public class UsingMultpleLineStatement {
	public static void main(String[] args) {
		
		Persons p=(name)->{
			System.out.println(name);
		return "Hello";
		};
		System.out.println(p.speak("ram"));
		
		
		
	}

}
