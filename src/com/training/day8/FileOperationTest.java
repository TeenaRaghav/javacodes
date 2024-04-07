package com.training.day8;

import java.util.*;
import java.io.*;
import java.nio.ReadOnlyBufferException;

public class FileOperationTest {
	public static void readTextFromFileUsingInputStream() throws IOException  {
		System.out.println("The data from file using Byte input stream");
		String userdir = System.getProperty("user.dir");
		File myfile = new File(userdir+"\\files\\read.txt");
		InputStream io = new FileInputStream(myfile);
		int i;
		while((i = io.read()) != -1) {
			System.out.print((char)i);
		}
		System.out.println();
		io.close();
	}
	
	public static void readTextFromFileUsingReader() throws IOException{
		System.out.println("The data from file using Character stream");
		String userdir = System.getProperty("user.dir");
		File myfile = new File(userdir+"\\files\\read2.txt");
		Reader io = new FileReader(myfile);
		int i;
		while((i = io.read()) != -1){
			System.out.print((char) i);
			
		}
		System.out.println();
		io.close();
	}
	
	public static void writeDataToFileUsingOutputStream() throws IOException {
		String userdir = System.getProperty("user.dir");
		OutputStream ob = new FileOutputStream(userdir+"\\files\\read1.txt");
		String text = "I can write in file through byte output stream class.";
		char[] data = text.toCharArray();
		for(char c : data) {
			ob.write(c);
		}
		ob.close();
		System.out.println("completed writing the data using byte outputStream.");
	}

	/*
	 * public static void writeDataToFileUsingWriter() throws IOException {
	 * String userdir = System.getProperty("user.dir");
	 *  Writer ob = new
	 * FileWriter(userdir+"\\files\\read2.txt");
	 * String text = "Hurray!!"; char[] data = text.toCharArray(); for(char c :
	 * data) { ob.write(c); } ob.close();
	 * System.out.println("completed writing the data using Character outputStream."
	 * ); }
	 */
	
	public static void writeDataToFileUsingWriter() throws IOException {
		String userdir = System.getProperty("user.dir");
		File myfile = new File(userdir+"\\files\\read2.txt");
		Writer ob = new FileWriter(myfile);
		ob.write("Hurray!! i did it.");
		ob.close();
		System.out.println("completerd writing using character output stream.");
		
	}
	public static void main(String[] args) throws IOException {
//		readTextFromFileUsingInputStream();
		readTextFromFileUsingReader();
//		writeDataToFileUsingOutputStream();
		writeDataToFileUsingWriter();
	}
}
/*
 * InputStream io = new
 * FileInputStream("C:\\Users\\tomar\\Documents\\file\\readfile.txt"); int i;
 * while((i=io.read())!=-1) { System.out.println((char)i); } io.close();
 */