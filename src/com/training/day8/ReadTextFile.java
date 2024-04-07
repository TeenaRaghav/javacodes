package com.training.day8;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
		String userdir = System.getProperty("user.dir");
//		define the path of the file
		String filepath = userdir+"\\files\\read.txt";

//		read the file
		FileReader filereader = new FileReader(filepath);

//		read the file line by line
		BufferedReader bufferReader = new BufferedReader(filereader);

		System.out.println(bufferReader.readLine());
		System.out.println(bufferReader.readLine());
		System.out.println(bufferReader.readLine());
		System.out.println(bufferReader.readLine());
		filereader.close(); //
//		System.out.println(bufferReader.readLine());

	}

	/*
	 * In this example, the readLine() method is used to read the file "myfile.txt"
	 * line by line. The line is then printed to the console. As you can see, the
	 * readLine() method does not remove the line after it retrieves it. The line is
	 * still present in the file. If you want to remove the line from the file, you
	 * can use the delete() method.
	 */
}
