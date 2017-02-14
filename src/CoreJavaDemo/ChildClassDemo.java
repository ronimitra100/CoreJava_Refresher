package CoreJavaDemo;

public class ChildClassDemo extends ParentClassDemo{
	String name = "Rahul";
	
	public ChildClassDemo(){
		super();
		System.out.println("Child Class constructor");
	}
	
	public void engine(){
		System.out.println("engine code implemented");
	}
	
	public void color(){
		System.out.println(color);
	}
	
	public void getData(int a){
	System.out.println(a);	
	super.getData(a);
	}
	
    public void getData(int a, int b){
    	System.out.println(a);
    	System.out.println(name);
    	System.out.println(super.name);
		
	}
    
    public void getData(String a){

    	System.out.println(a);	
    	}
    public void audiosystem(){
		System.out.println("new childclass audiosystem code is implemented");
	}

	
	
	public static void main(String[] args){
		ChildClassDemo cd = new ChildClassDemo();
		cd.color();
		cd.audiosystem();
		cd.getData(6,9);
		cd.getData(5);
	
		
		
	}

}
