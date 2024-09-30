
public class Try5 extends Try3 {

	public static void main(String[] args) {
		try {
		int arr[]= new int[5];
		System.out.println(arr[10]);
			}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
				
		catch (ArrayIndexOutOfBoundsException e){
			 
			System.out.println("ArrayIndexOut of Bounds Exception occurs");}
				
				catch(Exception e) {
				System.out.println("Parent Exception occurs");	
				}
	

				
	
System.out.println("Rest of the code");
}
}