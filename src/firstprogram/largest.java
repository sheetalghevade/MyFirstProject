package firstprogram;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int largest1 = largest23(10, 20);
		int largest2 = largest23(50, 32);
		
		System.out.println(" largest number is " +largest1);
		System.out.println(" largest number is " +largest2);
	}

	public static int largest23(int x, int y) {
		int large;
		if(x > y)
			large = x;
		else
			large = y;
		return large;
		
	}
}
