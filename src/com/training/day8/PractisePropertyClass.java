package com.training.day8;

import java.io.*;
import java.util.Properties;
import java.io.FileInputStream;

public class PractisePropertyClass {
	public static void main(String[] args) throws Exception {

		String userdir = System.getProperty("user.dir");
		String fileSeparator = System.getProperty("file.separator");
		String filepath = userdir+fileSeparator+"files"+fileSeparator+"data1.properties";
		System.out.println(filepath);

//		load the path into the file object
		InputStream fileinput = new FileInputStream(filepath);

// 		create the object as property file
		Properties table = new Properties();
		table.load(fileinput);

//		fetch the data from the property file
		System.out.println("Name :" + table.get("name"));

		System.out.println("URL : " + table.get("url"));

		System.out.println("Email : " + table.get("email"));

//		 write with outputstream
		OutputStream fileoutput = new FileOutputStream(filepath);
		
		table.setProperty("name ", " Pritish");

		table.setProperty("age ", " 32");

		table.setProperty("department ", " Finance");

//		   saving properties to property file 
		table.store(fileoutput, "properties");

		fileoutput.close();

		fileinput.close();
//		System.out.println("After saving properties: \n" + table);

	}
}
