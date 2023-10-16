package firstprogram;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day = 3;
		String daystring;
		
		switch(day) {
		
		case 1:
			daystring = "Monday";
			break;
			
		case 2:
			daystring = "Tuesday";
			break;
			
		case 3:
			daystring = "Wednesday";
			break;
			
		case 4:
			daystring = "Thursday";
			break;
			
		default:
			daystring = "this is a invalid day";
			
		}
		System.out.println(daystring);
	}

}
