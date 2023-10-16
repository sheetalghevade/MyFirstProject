package objectorientprogramming;

class Definedatatype{
	private String empname;
	private int empid;
	private int aadharnumber;
	
	public void setEmpname(String input) 
	{
		empname = input;
	}
	public void setEmpid(int input)
	{
		empid = input;
		
	}
	public void setEmpaadhar(int input)
	{
		aadharnumber = input;
	}
	
	
	public String getEmpname()
	{
		return empname;
	}
	public int getEmpid()
	{
		return empid;
	}
	public int getAadharnumber()
	{
		return aadharnumber;
		
	}
}



public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Definedatatype obj = new Definedatatype();
		obj.setEmpname("Sheetal");
		obj.setEmpid(5654);
		obj.setEmpaadhar(12345);
		
		System.out.println("Employee name is: " +obj.getEmpname());
		System.out.println("Employee id is: " +obj.getEmpid());
		System.out.println("Employee Aadhar Number is: " +obj.getAadharnumber());
		
		
		

	}

}
