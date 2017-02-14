package CoreJavaDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
	int b=7;
	int c=0;
	
	try {
		//int k=b/c; (causes arithmetic exception)
		int arr[] = {1, 3, 6};
		System.out.println(arr[5]); //causes array index out of bounds exception
		
	}
	catch (ArithmeticException ae){
		System.out.println("I caught Arithmetic Exception");
	}
	catch (ArrayIndexOutOfBoundsException ae){
		System.out.println("I caught Array Index Out of Bounds Exception");
	}
	catch(Exception e){
		System.out.println("I caught the generic exception ");
	}
	finally{
		System.out.println("Finally block is executed irrespective or there being an error or not");
	}
	

	}

}
