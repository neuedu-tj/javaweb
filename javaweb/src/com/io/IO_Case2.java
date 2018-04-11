package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IO_Case2 {

	public static void main(String[] args) throws Exception {
		
		File file_hello = new File("file/hello.txt");
		
		InputStream in = new FileInputStream(file_hello);
		
		byte[] data = new byte[in.available()];
		
		in.read(data);
		
		File target = new File("file/result.txt");
		
		OutputStream out = new FileOutputStream(target);
		
		out.write(data);
		
		out.flush();
		

	}

}
