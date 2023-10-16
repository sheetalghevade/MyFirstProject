package objectorientprogramming;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone display = new Phone();
       display.displaymodel();
       
       Smartphone model = new Smartphone();
       model.displaymodel();
       
       Phone nokia = new Smartphone();
       nokia.displaymodel();
       
       Phone sm =  new Smartphone();
       
       sm.displaymodel();
	}

}
