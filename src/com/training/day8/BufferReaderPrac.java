package com.training.day8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class BufferReaderPrac {
	public static void main(String[] args) throws IOException {
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		File file = new File(userDir +"\\files\\read2.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader bufferreader = new BufferedReader(fr);
//		System.out.println(bufferreader.readLine());
//		System.out.println(bufferreader.readLine());

//		how to read complete file
		String str;
		while((str = bufferreader.readLine()) != null) {
			System.out.println(str);
			
		}
	}
}
