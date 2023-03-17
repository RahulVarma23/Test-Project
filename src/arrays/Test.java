package arrays;


public class Test {
	
	int a =20;

	public static void main(String[] args) throws CloneNotSupportedException {
		Test t1 = new Test();
		System.out.println(t1.a);
		
		Test t2= (Test) t1.clone();
		System.out.println(t2.a);
		
	}

}
