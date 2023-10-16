package firstprogram;

public class LinearSearch {
	public static int linsearch(int arr[], int key) {
		for(int i=0;i<arr.length; i++) {
			if(arr[i]== key) {
				return i;
			}
				
			  
		}
		return -1;
	}

	public static void main(String[] ary) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {10,37,48,28,90,45};
		int key = 90;
		System.out.println(key +" is at index " +linsearch(arr, key));
	}

}
