package CoreJavaDemo;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		//Print unique numbers in an array, or 
		//print frequency of numbers in an array
		int a[] = {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i=0;i<a.length; i++){
			int k = 0;
			if (!al.contains(a[i])){
				al.add(a[i]);
				k++;
				for (int j =i+1; j<a.length; j++){
					if(a[i]==a[j]){
					k++;}
				}
				System.out.println("The number " + a[i]+ " occurs " + k + " times.");
				if (k==1){
					System.out.println(a[i] + " is a unique number.");
				}
			}
		}

	}

}
