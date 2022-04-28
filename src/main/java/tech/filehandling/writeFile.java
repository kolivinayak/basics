package tech.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("C:\\Users\\vinayak.shankar.koli\\EclipseProj\\src\\main\\resources\\test123.txt");
//		FileWriter fw = new FileWriter(".\\resources\\test123.txt");
		
		fw.write("Hello");
		
		System.out.println("Success");
		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\vinayak.shankar.koli\\EclipseProj\\src\\main\\resources\\test123.txt");
//		FileReader fr = new FileReader(".\\resources\\test123.txt");
		int i;
		
		while ((i = fr.read()) != -1) // -1 end of file
		{
			System.out.print((char)i); // since value is integer we have to type cast it 
		}
		
		fr.close();
	}

}
