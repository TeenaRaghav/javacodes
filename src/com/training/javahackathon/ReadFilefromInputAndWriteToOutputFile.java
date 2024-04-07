package com.training.javahackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFilefromInputAndWriteToOutputFile {
	public static void main(String[] args) throws Exception {
		String userDir = System.getProperty("user.dir");
		String fileseparator = System.getProperty("file.separator");
//		define the path of the file
		String inputfile = userDir+fileseparator+"files"+fileseparator+"Read";
		String outputfile = userDir+fileseparator+"files"+fileseparator+"WriteForJavaHackathon";
		
//		object of file reader using filepath
		FileReader reader = new FileReader(inputfile);
		BufferedReader bufferReader = new BufferedReader(reader);
		
		FileWriter writer = new FileWriter(outputfile);
		BufferedWriter bufferwriter = new BufferedWriter(writer);
		
//		read file line by line
		String str = "";
		int i;
		while((i = bufferReader.read()) != -1) {
			str += (char) i;
		}
		
		bufferwriter.write(str);
		bufferwriter.newLine();
		
		bufferReader.close();
		bufferwriter.close();
		System.out.println("file reading and writing is done.");
		
	}
}
