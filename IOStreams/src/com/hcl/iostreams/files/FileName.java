package com.hcl.iostreams.files;

import java.io.File;

public class FileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "D:\\smpleone.txt";
//pass the filenmae or directory name to file obj
		File file = new File(fname);
//apply file class methods on file object
		System.out.println("File name:" + file.getName());
		System.out.println("Absolute path:" + file.getAbsolutePath());
		System.out.println("Exists:" + file.exists());
		if (file.exists()) {
			System.out.println("Is writeable:" + file.canWrite());
			System.out.println("Is readable:" + file.canRead());
			System.out.println("Is a directory:" + file.isDirectory());
			System.out.println("FileSize in bytes:" + file.length());

		}
	}

}
