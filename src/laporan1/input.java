package adri1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class input {

	public static void main( String[] args ){
		BufferedReader dataIn = new BufferedReader(new
				  		InputStreamReader( System.in) );

		String name = "";  
		System.out.println("BIODATA");
		System.out.println("Please Enter Your Name:");
	 	try{ 
			name = dataIn.readLine();
    	}catch( IOException e ){
		 	System.out.println("Error!");
    	} 
	 	String alm = null; 
	 	System.out.println("ALAMAT:");
	 	try{ 
			alm = dataIn.readLine();
    	}catch( IOException e ){
		 	System.out.println("Error!");
    	} 
	 	String kerja = null; 
	 	System.out.println("PEKERJAAN:");
	 	try{ 
			kerja = dataIn.readLine();
    	}catch( IOException e ){
		 	System.out.println("Error!");
    	} 
	 	System.out.println("");
		System.out.println("Nama : " + name);
		System.out.println("Alamat : " + alm);
		System.out.println("Pekerjaan : " + kerja);
} 
}
