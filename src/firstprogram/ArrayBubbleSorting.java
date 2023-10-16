package firstprogram;

public class ArrayBubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {3,15,4,81,6};
		System.out.println("Array before sorting:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		bubblesort(arr);
		
		System.out.println("\nArray  after sorting:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}

	}

	 static void bubblesort(int arr[]) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		int temp = 0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

}
