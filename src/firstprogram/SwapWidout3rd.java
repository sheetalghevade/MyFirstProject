package firstprogram;

public class SwapWidout3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 40;
		int y = 30;
		System.out.println("First number is: "+x);
		System.out.println("Second Number is: "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("First value after swap is: " +x);
		System.out.println("Second value after swap is: "+y);
	}

}
