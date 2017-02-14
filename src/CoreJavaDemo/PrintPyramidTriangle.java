package CoreJavaDemo;

public class PrintPyramidTriangle {
	public static void main(String[] args){
		int n = 1;
		for (int i=1; i<=4; i++){
			for (int j=1; j<=4-i+1; j++){
				
				System.out.print(n + " ");
				n++;
			}
			System.out.println("");
		}
	}

}
