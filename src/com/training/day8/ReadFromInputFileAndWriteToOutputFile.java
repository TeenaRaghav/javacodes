package com.training.day8;

import java.io.*;

public class ReadFromInputFileAndWriteToOutputFile {
	public static void main(String[] args) throws Exception {
		String userDir = System.getProperty("user.dir");
		String fileseperator = System.getProperty("file.separator");
//define the path of input file and output file from where we want to read and write to
		String inputfile = userDir + fileseperator + "files" + fileseperator + "example1.txt";
		String outputfile = userDir + fileseperator + "files" + fileseperator + "write.txt";

// make the object of filereader using file path
		Reader reader = new FileReader(inputfile);
		BufferedReader bufferreader = new BufferedReader(reader);

		Writer writer = new FileWriter(outputfile);
		BufferedWriter bufferwriter = new BufferedWriter(writer);

//		 read file line by line
		String str = "";
		int i;
		while ((i = bufferreader.read()) != -1) {
			str += (char) i;
		}
//		System.out.println(str);
		bufferwriter.write(str);
		bufferwriter.newLine();

		bufferreader.close();
		bufferwriter.close();

		System.out.println("file reading and writing both done");
	}
}
