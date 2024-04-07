package com.training.day8;

import java.io.*;

public class ReadDataFromTextFile {
	public static void main(String[] args) throws IOException {
		String userdir = System.getProperty("user.dir");
		String filepath = userdir+"\\files\\read2.txt";
		
		/* reading text file using byte stream subclass
		 * try { InputStream io = new FileInputStream(filepath); int ch; while((ch =
		 * io.read()) != -1) { System.out.print((char)ch); } io.close(); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
//		reading text file using character stream subclass
	 Reader ob = new FileReader(filepath);
//	 skips the number of characters 
	 ob.skip(3);
		int data;
		while((data = ob.read()) != -1) {
			System.out.print((char) data);
		}
		
		ob.close();
	}
}
