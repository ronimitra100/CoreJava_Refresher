package CoreJavaDemo;

public class MinimumNumberInMatrix {
	
	public static void main(String[] args){
		int abc[][] = {{67,85,96},{4,9,89}, {2, 106, 25}};
		
		int min = abc[0][0];
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				if(abc[i][j]< min){
					min = abc[i][j];
				}
			}
			
		}
		System.out.println("The minimum is " + min);
		
		int max = abc[0][0];
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				if(abc[i][j]> max){
					max = abc[i][j];
				}
			}
			
		}
		System.out.println("The mmaximum is " + max);
		
	}

}
