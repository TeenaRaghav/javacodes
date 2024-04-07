package com.training.day8;

import java.io.*;

public class ReadDataFromCsvFile {
	public static void main(String[] args) throws IOException {
		String userdir = System.getProperty("user.dir");
		String filepath = userdir+ "\\files\\data.csv";
		try {
			Writer writer = new FileWriter(filepath);
//		write csv header
			writer.write("Name, Age, Department \n");
			
//			write data records
			
			writer.write("joe, 20, finance \n");
			writer.write("pheobe, 30, Sales \n");
			writer.write("chandler, 33, Marketing \n");
			writer.write("Ross, 38, finance \n");
			writer.append("hello ").append("world\n").append("how you doing?");
	
			writer.close();
			System.out.println("CSV file created succesfully!!\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occurred : " + e.getMessage());
			e.printStackTrace();
		}
		
		Reader read = new FileReader(filepath);
		int ch;
		
		while((ch = read.read()) != -1){
			System.out.print((char)ch );
		}
		System.out.println();
		read.close();
		
		}
}
