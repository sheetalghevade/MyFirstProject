package firstprogram;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[][]= {{11,22,33},{33,22,11}};
		int arr2[][]= {{33,22,11},{11,22,33}};
		int arr3[][]= new int[2][3];
		
		System.out.println("\nArray 1:\n ");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				
				System.out.print(arr1[i][j] +" ");
								
			}
			System.out.println();
		}
		
       System.out.println("\nArray 2:\n ");
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				
				System.out.print(arr2[i][j] +" ");
								
			}
			System.out.println();
		}
		
		System.out.println("\nArray Addition:\n ");
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				arr3[i][j]= arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] +" ");
			}
			System.out.println();
		}
	}

}
