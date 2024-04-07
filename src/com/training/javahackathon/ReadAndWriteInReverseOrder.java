package com.training.javahackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadAndWriteInReverseOrder {
	public static void reverseFileContent(String inputfile, String outputfile) throws Exception {
		List<String> lines = new ArrayList<>();
//		object of file reader using filepath
		FileReader reader = new FileReader(inputfile);
		BufferedReader bufferReader = new BufferedReader(reader);
		String line;
		while((line = bufferReader.readLine()) != null) {
			lines.add(line);
		}
		Collections.reverse(lines);
//		object of file writer using filepath
		FileWriter writer = new FileWriter(outputfile);
		BufferedWriter bufferwriter = new  BufferedWriter(writer);
		for(String line1 : lines) {
			bufferwriter.write(line1);
			bufferwriter.newLine();
		}
		bufferReader.close();
		bufferwriter.close();
	}
	
	public static void main(String[] args) throws Exception {
		String userDir = System.getProperty("user.dir");
		String fileseparator = System.getProperty("file.separator");
//		define the path of the file
		String inputfile = userDir+fileseparator+"files"+fileseparator+"Read";
		String outputfile =userDir +fileseparator+"files"+fileseparator+"WriteInReverseOrder";
		reverseFileContent(inputfile,outputfile);
		System.out.println("File content reversed successfully!.");
	}
}
