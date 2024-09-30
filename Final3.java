
public class Final3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("inside the try block");
int data=25/0;
System.out.println("data");
	}
catch(ArithmeticException e) {
	System.out.println(e);
	System.out.println("exception is handled");
}
		finally {
		System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
}
	}


