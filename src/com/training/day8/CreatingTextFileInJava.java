package com.training.day8;

import java.io.*;

public class CreatingTextFileInJava {
	public static void main(String[] args) {
		String userdir = System.getProperty("user.dir");
		//		file path
		
		String filepath = userdir+"\\files\\example1.txt";
//		create filewriter object and pass file path to its constructor

		
		  try {
		   FileWriter fw = new FileWriter(filepath);
		  
		  // We use the write() method of the FileWriter object to write content to the file.
		   fw.write("how you doin??\nRoses are red, sky is Blue");
		  
		  // Finally, we close the FileWriter object to release any resources associated with it. 
		  fw.close();
		  
		  System.out.println("file created successfully!!");
		   } catch (IOException e) {
		  // TODO Auto-generated catch block 
		  System.out.println("An error occurred : "
		  + e.getMessage()); e.printStackTrace(); }
		 		 
		try {
			Reader fr = new FileReader(filepath);
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
