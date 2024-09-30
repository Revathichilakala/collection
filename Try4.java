
public class Try4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int arr[]= new int[5];
arr[5]=30/0;
	}
catch(ArithmeticException e) {
	System.out.println("Arithmetic Exception occurs");
}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Indexout of Bounds Exception occurs");
		}
		catch(Exception e) {
		System.out.println("Parent Exception occurs");	
		}
		System.out.println("Rest of the code");
	}
}
