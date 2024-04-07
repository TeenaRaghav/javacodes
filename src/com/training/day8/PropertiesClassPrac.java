package com.training.day8;
import java.io.*;
import java.util.Properties;
public class PropertiesClassPrac {
	public static void main(String[] args) throws IOException {
		String userdir = System.getProperty("user.dir");
		File myfile = new File(userdir+"\\files\\data.properties");
		Properties prop = new Properties();
		InputStream fi = new FileInputStream(myfile);
		prop.load(fi);
		
		//		writing or updating  in property file
		prop.setProperty("Age", "32");
		prop.setProperty("grade","12");

		OutputStream fo = new FileOutputStream(myfile);
		
		prop.store(fo,"updating the property");
		String name = prop.getProperty("Name");
		System.out.println("Name : " +  name);
		
		String age = prop.getProperty("Age");
		System.out.println("Age : " +  age);
		
		String grade = prop.getProperty("grade");
		System.out.println("grade : " +  grade);
	
		fi.close();
		fo.close();
		
		System.out.println("number of properties in file : " + prop.size());
	}
	 
}
