package com.io;

import java.io.File;

public class IO_Case01 {

	public static void main(String[] args) {
		
		File file_hello = new File("file/hello.txt");
		
		File file = new File("file");
		
//		System.out.println(file_hello.exists());
		
//		System.out.println(file_hello.isFile());
		
		System.out.println(file_hello.length());
		
		

	}

}
