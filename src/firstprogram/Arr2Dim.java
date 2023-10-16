package firstprogram;

import java.util.Arrays;

public class Arr2Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test[][] = {{1,2,3},
				{4,5,6}};
		int num_rows = test.length;
		int num_clms = test[0].length;
		System.out.println("number of rows = " +num_rows);
		System.out.println("number of columns = " +num_clms);
		System.out.println();
		System.out.println("Our Array");
		
		for(int i=0; i< num_rows; i++) {
			System.out.println("values in row number " +(i+1) +" are");
			
			for(int j=0;j<num_clms;j++) {
				
		System.out.print(test[i][j]+" ");
				
		}
			System.out.println();

		}
		System.out.print(Arrays.deepToString(test));
		
	}

}
