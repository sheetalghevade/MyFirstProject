package firstprogram;

public class StringArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr[] = {"sheetal","neeraj","dhruv","Sheetal"};
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
	
	static boolean string_comparison(String string1, String string2){
		int loop_end;
		if (string1.length() < string2.length()){
			loop_end = string1.length();
		}
		else {
			loop_end = string2.length();
		}
	
		for(int i=0;i<loop_end;i++) {
			if ((int)string1.charAt(i)< (int)string2.charAt(i)) {
				return false;
			}
			else if((int)string1.charAt(i)> (int)string2.charAt(i)) {
				return true;
			}
					
		}
		return false ;
	}
	
	

	
	 static void bubblesort(String arr[]) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		String temp;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(string_comparison(arr[j-1] , arr[j])) {
				temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				
				}
			}
		}
		
	}

}
