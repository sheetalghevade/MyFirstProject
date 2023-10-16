package firstprogram;

public class CommandlineExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		char c = args[2].charAt(1);
		if(c=='a')
		System.out.println(a+b);
		else
			if(c=='s')
		System.out.println(a-b);
			else
				if(c=='t')
			System.out.println(a*b);
	}

}
