package firstprogram;

public class ReverseStringUsingSubstringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "account is great";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
	}

}
