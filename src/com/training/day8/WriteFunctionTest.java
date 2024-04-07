package com.training.day8;

import java.io.*;

public class WriteFunctionTest {
	public static void main(String[] args) throws IOException {
		String userdir = System.getProperty("user.dir");
//		define the path of the file
		String filepath = userdir+"\\files\\writeFunctionExample.txt";
	
		Writer fw = new FileWriter(filepath);
		fw.write("hi are you there?\n");
		
		fw.close();
		System.out.println("written successfully");

		Reader fr = new FileReader(filepath);
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}
		System.out.println();
		fr.close();
	}
}
//the write() method overwrites the existing data in the file