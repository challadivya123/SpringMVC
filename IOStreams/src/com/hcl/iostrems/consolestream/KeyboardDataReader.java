package com.hcl.iostrems.consolestream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class KeyboardDataReader {

	public static void main(String[] args)throws IOException {
	// TODO Auto-generated method stub
		//wrapping the stream
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//inputstreamreader obj is wrapped into bufferedreader constructor
		String strNum;
int num;
strNum=br.readLine();
num=Integer.parseInt(strNum);
System.out.println("num="+(num+num));
	}

}
