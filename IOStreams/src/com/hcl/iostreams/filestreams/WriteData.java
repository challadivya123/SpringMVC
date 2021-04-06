package com.hcl.iostreams.filestreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos=new FileOutputStream("c:\\Divya\\empbyte.txt");
		String str1="1234,Kumar,Manager,89382\n";
		String str2="3456,Divya,Operation Manager,83737";
		try {
			fos.write(str1.getBytes());
			fos.flush();
			
			fos.write(str2.getBytes());
			fos.flush();
			
			System.out.println("data has been written");
		}catch(Exception e) {
			System.out.println("Error writting to a file:"+e);
		}
		finally {
			fos.close();
		}
		// TODO Auto-generated method stub

	}

}
