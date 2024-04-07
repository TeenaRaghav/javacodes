package com.training.day8;

import java.io.*;
import java.util.Properties;

public class ReadFromAndWriteToPropertiesFile {
	static File file;
	public static void saveProperties(Properties p) throws IOException {
	OutputStream fw = new FileOutputStream(file);
	p.store(fw, "Properties");
	fw.close();
	System.out.println("After saving properties :" + p);
}
	public static void loadProperties(Properties p) throws IOException {
		InputStream fr = new FileInputStream(file);
		p.load(fr);
		fr.close();
		System.out.println("After loading properties :" + p);
	}
	
	public static void main(String[] args) throws IOException {
		String userdir = System.getProperty("user.dir");
		 file = new File(userdir + "\\files\\data1.properties");
		Properties prop = new Properties();
		
		prop.setProperty( "1", "joe");
		prop.setProperty("2","rachel" );
		prop.setProperty("3","ross" );
		
		System.out.println("properties has been set in table:" + prop);
		
//		saving properties in file
		saveProperties(prop);
		
//		changing the property
		prop.setProperty("1","chandler");
		System.out.println("After the change in table:" + prop);

//		saving properties in file		
		saveProperties(prop);
		
//		loading the saved properties
		loadProperties(prop);
	}
}
