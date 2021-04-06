package com.hcl.iostreams.filestreams;

import java.io.FileReader;
import java.io.IOException;

public class CharFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create an array of characters
char[] array=new char[24];
FileReader input=null;
try {
	input=new FileReader("c:\\Divya\\empchar.txt");
	//read characters
	input.read(array);
	System.out.println("Data in the file");
	System.out.println(array);
	//closes the reader
}
catch(Exception e) {
	e.getStackTrace();
}
finally {
	input.close();
}
	}

}
