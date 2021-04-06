package com.hcl.iostreams.filestreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("c:\\Divya\\empbyte.txt");
		try {
			System.out.println("File size:"+fis.available());
			String str=new String();
			int index=0;
			while(fis.available()>0) {
				char ch=(char)fis.read();
				str=str+ch;
			}
			String emp1[],emp2[];
			emp1=str.split("\n");
			System.out.println("First employee details:");
			System.out.println(emp1[0]);
			System.out.println("\n\nSecond employee details");
			System.out.println(emp1[1]);
		}catch(Exception e) {
			System.out.println("Error reading file:"+e);
		}finally {
			fis.close();
		}

	}

}
