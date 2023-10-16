package objectorientprogramming;

public class Phone {
	
	String model = "Nokia";
	public void displaymodel() {
		System.out.println("display model of phone: " +model);
	}
	public void sendSMS() {
		System.out.println("Sending sms.....");
	}
	
	public void call() {
		System.out.println("calling ....");
	}

}
