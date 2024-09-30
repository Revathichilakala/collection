
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a=new int[5];
try {
a[10]=50;
	
System.out.println(a);
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("array index error");
}
}
}