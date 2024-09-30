
public class Try6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	try {
		System.out.println("go to divide by zero");
		int b=35/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
try {
	int a[]=new int[5];
	a[5]=4;
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("ArrayIndexOutOfBoundsException occurs");
}
System.out.println("other statement");
	}
catch(Exception e) {
	System.out.println("handle the Exception (outer catch)");
}
System.out.println("normal flow");
}
}