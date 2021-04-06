package com.hcl.iostreams.files;

import java.io.File;
import java.io.IOException;

public class FileCreator {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
File file=new File("C:\\Divya\\sampleone.txt");
if(file.createNewFile()) {
	System.out.println("File created:"+file.getName());
}else {
	System.out.println("File already exist");
}

	
	}

}
