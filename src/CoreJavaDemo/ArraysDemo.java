package CoreJavaDemo;

public class ArraysDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[4];
		a[0]=1;
		a[1]=6;
		a[2]=9;
		a[3]=11;
		
		System.out.println("Array a:");
		for (int i=0; i<=a.length-1; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println("Array b:");
		int b[]={15, 19};
		
		for (int i=0; i<=b.length-1; i++){
			System.out.print(b[i] +" ");
		}
		

		System.out.println("");
		
		int c[][] = new int[2][3];	
		c[0][0]=57;
		c[0][1]=80;
		c[0][2]=96;
		c[1][0]=4;
		c[1][1]=9;
		c[1][2]=89;
		
		int d[][] = {{67,85,96},{4,9,89}};
		
		System.out.println("Array c:");
		
		for (int i=0; i<2; i++){
			for (int j=0; j<3; j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
		
System.out.println("Array d:");
		
		for (int i=0; i<2; i++){  //row
			for (int j=0; j<3; j++){ //column
				System.out.print(d[i][j] + " ");
			}
			System.out.println("");
		}	
		
		
	}

}
