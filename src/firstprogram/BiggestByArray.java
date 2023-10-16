package firstprogram;

import java.util.Scanner;
public class BiggestByArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Enter total number of integer's entering in the array(Array Length");
	
	int a = reader.nextInt();
	
	int arr[] = new int[a];
	
	System.out.println("Enter Numbers");
	for(int i=0; i<a;i++) 
	{
		 arr[i]= reader.nextInt();
		 
   	}
	reader.close();
	System.out.println("Array of Entered number is: ");
	
	for(int i=0;i<a;i++)
	{
		System.out.print(arr[i] +" ");
			
	}
	
	System.out.println();
		bubblesort(arr);
		
		int x = arr[a-1];
		int y = arr[a-2];
		int z = arr[a-3];
		
		System.out.println("bigest number is: " +x);
		System.out.println("Second big number is: " +y);
		System.out.println("First big number is: " +z);
	}	
		
		
		static void bubblesort(int arr[]) {
		
			int temp;
			int b = arr.length;
			for(int i= 0; i<b; i++) {
				for(int j=1;j<b-i;j++) {
					if (arr[j-1]> arr[j]) {
						temp = arr[j-1];
						arr[j-1]= arr[j];
						arr[j]= temp;
					}
				}
			}
		}
			

	}


