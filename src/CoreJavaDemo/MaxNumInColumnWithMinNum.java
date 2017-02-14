package CoreJavaDemo;

public class MaxNumInColumnWithMinNum {
	
	public static void main(String[] args){
		
int abc[][] = {{2,4,5},{3,0,10}, {1,2,9}};
		
int min = abc[0][0];
int minColumn =0;
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				if(abc[i][j]< min){
					min = abc[i][j];
					minColumn = j;
				}
			}
			
		}
		System.out.println("The minimum is " + min + " and the minimum column  is " + minColumn);
		
		
		int max=abc[0][minColumn];
		for(int k=0; k<3; k++){
			if (abc[k][minColumn]>max){
				max = abc[k][minColumn];
				
			}
				
		}
		
		System.out.println("The maximum in the column containing the minimum is " + max);
		
	}

}
