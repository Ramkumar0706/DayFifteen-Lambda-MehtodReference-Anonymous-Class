package lambda;


interface Calculator{
	int  add(int a,int b);
}




public class LambdaWithParameter {
	
	public static void main(String[] args) {
		Calculator c1=(int a,int b)->{
			return a+b;
		};
		System.out.println(c1.add(11, 22));
		
		Calculator c2=(int a,int b)->a+b;
		System.out.println(c2.add(11, 22));
	
		Calculator c=(a,b)->a+b;;
		System.out.println(c.add(10, 20));
	}

}
