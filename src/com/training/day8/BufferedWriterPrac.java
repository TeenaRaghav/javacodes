package com.training.day8;

import java.io.*;

public class BufferedWriterPrac {
	public static void main(String[] args) throws IOException {
		String userDir = System.getProperty("user.dir");
		String fileseperator = System.getProperty("file.separator");
//		System.out.println(userDir);
		File file = new File(userDir + fileseperator+"files"+fileseperator+"write.txt");

		Writer write = new FileWriter(file);
		BufferedWriter bufferwriter = new BufferedWriter(write);
		bufferwriter.write("welcome to java \n");
		bufferwriter.write("hi \n");
		bufferwriter.write("hello \n");
		bufferwriter.close();
	}
}
