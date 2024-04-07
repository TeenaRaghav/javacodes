package com.training.day8;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class GetSystemProperties {
	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		
		Set set = p.entrySet();
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey() +" = "+  entry.getValue());
		}
		
	}
}
//Java program to demonstrate Properties class to get all 
//the system properties 

//import java.util.*; 
//import java.io.*; 
//
//public class GFG { 
//	public static void main(String[] args) throws Exception 
//	{ 
//		// get all the system properties 
//		Properties p = System.getProperties(); 
//
//		// stores set of properties information 
//		Set set = p.entrySet(); 
//
//		// iterate over the set 
//		Iterator itr = set.iterator(); 
//		while (itr.hasNext()) { 
//
//			// print each property 
//			Map.Entry entry = (Map.Entry)itr.next(); 
//			System.out.println(entry.getKey() + " = "
//							+ entry.getValue()); 
//		} 
//	} 
//}
