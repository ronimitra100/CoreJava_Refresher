package CoreJavaDemo;

public class ConstructorDemo {

	public ConstructorDemo(){
		System.out.println("I'm the default constrctor");
	}
	
	public ConstructorDemo(int a, int b){
		System.out.println("I'm the Lecture1 constrctor");
	}
	
	public ConstructorDemo(String str){
		System.out.println(str);
	}
	
	public void getData(){
		System.out.println("I'm in the new method.");
	}
	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo("hello");
		ConstructorDemo c3 = new ConstructorDemo(4,5);

	}

}
