package firstprogram;

public class StringReverse {
	
	
	static void reversestring(String input_string)
	{
		StringBuilder reversed_string = new StringBuilder(input_string);
		
		int j = input_string.length()-1;
		for(int i=0;i<j;i++)
		{
		  	   char temp = input_string.charAt(i);

				  
			    reversed_string.setCharAt(i, input_string.charAt(j));  
			    reversed_string.setCharAt(j, temp);
			    j--;
			
			    
			  }
			  
		System.out.println("Reversed String is: " +reversed_string);
		
		
		
	}
	


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String input_string = "sheetal is qa ";
		
		
						
		System.out.println("String entered is: " +input_string);
				
		reversestring(input_string);
		
		
		
			
		
	}

}
