package CoreJavaDemo;

public class SwapWithoutTempVariable {
	

	public static void main(String[] args) {
		
		int a = 7;
		int b =0 ;
		
		System.out.println("Before swapping, a=" + a +" and b=" + b);
		a= a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping, a=" + a +" and b=" + b);
		

	}

}
