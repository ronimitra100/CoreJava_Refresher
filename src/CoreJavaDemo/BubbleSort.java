package CoreJavaDemo;

public class BubbleSort {
	
	public static void main(String[] args){
		int a[]={2,6,1,4,9};
		
		for (int i=0; i<5; i++){
			for (int j=i+1; j<5; j++){
				int temp;
				if (a[j]<a[i]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int k=0; k<5; k++){
		System.out.print(a[k] + " ");
		}
	}

}
