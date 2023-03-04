package tech.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertyFiledDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("C:\\Users\\vinayak.shankar.koli\\EclipseProj\\src\\main\\java\\tech\\filehandling\\vinayak1.properties");
		
		Properties p = new Properties(); // create property class object
		
		p.setProperty("url", "www.facebook.com"); //setter method for property class
		p.setProperty("password", "pwd");
		
		p.store(fw, "comments for this property");
		
		fw.close(); //property file by default takes alphabetically 
		
		
		FileReader fr = new FileReader("C:\\Users\\vinayak.shankar.koli\\EclipseProj\\src\\main\\java\\tech\\filehandling\\vin.properties");
		
		//p.load(fr);
		
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("password"));
				
		p.load(fr); // you can mention it anywhere, java takes it systemetically
		
		fr.close();
	}

}
