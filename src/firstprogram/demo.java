package firstprogram;

public class demo {
	
	int a;
	int b;
	int sum;
	
	public void addition(){
		 sum = a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     demo d1 = new demo();
     d1.a = 5;
     d1.b = 4;     
     d1.addition();
     
	System.out.println("hi");
	System.out.println(d1.sum);
	}

}
