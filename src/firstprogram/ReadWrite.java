package firstprogram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\gheva\\eclipse-workspace\\MyFirstProject\\File\\sampledata.properties");
		
		FileReader f1 = new FileReader(f);
		
		Properties p = new Properties();
		
         p.load(f1);
		
		System.out.println(p.getProperty("session"));
	}
	
}
