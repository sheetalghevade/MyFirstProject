package firstprogram;
import java.util.Scanner;

public class FindingBiggestNoAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("input 1st number:");
		
		int a = reader.nextInt();
		
		System.out.println("input 2nd number");
		
		int b = reader.nextInt();
		
		System.out.println("Input 3rd Number");
		
		int c = reader.nextInt();
		reader.close();
		
		
	if(a<b) {
		if (a<c) {
			System.out.println("The First Bigg number is: " +a);
			if(b<c) {
				System.out.println("The Second big number is:" +b);
				System.out.println("The Biggest Number is: "+c);
			}
					
		}
		else if(a>c) {
			System.out.println("The First Bigg Number is: "+c);
			System.out.println("The Second Big Number is : "+a);
			System.out.println("The Biggest Number is: " +b);
		}
	}
	
		else
			if (a>b){
			if(a>c) {
				System.out.println("The Biggest number is: " +a);
				if(b>c) {
					System.out.println("The first big number is:" +c);
					System.out.println("The Second Bigg Number is: "+b);
				}
				
			}
			else if(a<c){
				System.out.println("The First Bigg Number is: "+b);
				System.out.println("The Second Big Number is : "+a);
				System.out.println("The Biggest Number is: " +c);
		}
		}
		
		
	
	else {
		System.out.println("All numbers are equal");
	}

}
}