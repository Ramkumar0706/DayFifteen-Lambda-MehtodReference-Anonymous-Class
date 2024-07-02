package lambda;

@FunctionalInterface
interface Person{
	public void isWork();
}



public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		Person p=()->{
			System.out.println("The person is working in the office");
		};
		p.isWork();
	}

}
