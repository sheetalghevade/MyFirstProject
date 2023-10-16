package firstprogram;

import java.util.Arrays;

public class SortStringArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample_array[] = {"sheetal","neeraj"};
		System.out.println("Array before sorting: " );
		
		for(int i=0;i<2;i++) {
			System.out.print(sample_array[i] +" ");
		}
		
		System.out.println();
		System.out.println();
		
		Arrays.sort(sample_array);
		
		System.out.println("Array after sorting: " );
		
		for(int i=0;i<2;i++) {
			System.out.print(sample_array[i] +" ");
		}
		
		
	//	char first= sample_array.charAt(0);
		
		
	//sort_string(sample_array);
		
	//	System.out.print(Arrays.deepToString(sample_array) +" ");
	//	System.out.println();
		
	}

//	public static String[] sort_string(String in_array[]) {
		
	//}
		
	}

