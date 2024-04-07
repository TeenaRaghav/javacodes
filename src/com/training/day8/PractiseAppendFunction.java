package com.training.day8;

import java.io.*;

public class PractiseAppendFunction {
	public static void main(String[] args) throws IOException {
		String userdir = System.getProperty("user.dir");
		String filepath = userdir + "files\\appendexample.txt";
		Writer fw = new FileWriter(filepath,true);
		fw.append("hi are you there?\n");
		fw.close();
		System.out.println("written successfully");
		
		Reader fr = new FileReader(filepath);
		int ch;
		while((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}
		System.out.println();
		fr.close();
	}
}
//the append() method adds the new line of text to the end of the file