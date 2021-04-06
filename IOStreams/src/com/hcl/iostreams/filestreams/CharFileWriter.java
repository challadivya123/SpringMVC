package com.hcl.iostreams.filestreams;

import java.io.FileWriter;
import java.io.IOException;

public class CharFileWriter {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
String data="1234,Kumar,86754\\n";
FileWriter output=null;
try {
	//craete a file
	output=new FileWriter("c:\\Divya\\empchar.txt");
	//writes the string to the file
	output.write(data);
	//vloses the writer
	output.flush();
	System.out.println("File has been created");
}
catch(Exception e) {
	e.getStackTrace();
}
finally {
	output.close();
}
	}

}
