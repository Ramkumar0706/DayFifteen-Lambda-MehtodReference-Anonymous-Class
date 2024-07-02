package anonymousObject;

interface Employee{
	
	public void isWork();
	
}

public class Example {
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee() {
			@Override
			public void isWork() {
				System.out.println("the Employee is working ");
			}
		};
		e.isWork();
		
		
	}

}
