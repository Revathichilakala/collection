
public class Number {

	public static void main(String[] args) { // TODO Auto-generated method stub

		String s = "ABC";
		
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {

		}
		System.out.println("changing datatype");

	}

}

/*
 * public class Number {
 * 
 * public static void main(String[] args) { String s = "ABC";
 * 
 * try { int i = Integer.parseInt(s); System.out.println(i); } catch
 * (NumberFormatException e) { // System.out.println("Invalid input: " + s +
 * " is not a valid integer."); }
 * 
 * System.out.println("Changing datatype."); } }
 */