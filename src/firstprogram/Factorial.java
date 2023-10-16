package firstprogram;

public class Factorial {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		long factorial = fact(a);
		System.out.println("Factorial of number " +a + "=" +factorial);
		
			}

	public static long fact(int a) {
		if (a == 1) {
			System.out.println("Factorial(" +a + ")" +"= 1\n");
		return 1;
		}
		else {
		System.out.println("Factorial(" +a +") =" +a +"* factorial(" +(a-1)+")");
			
		 return fact (a-1)*a;
		}
	}
	
}
