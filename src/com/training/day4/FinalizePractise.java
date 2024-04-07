package com.training.day4;

public class FinalizePractise {
	public static void main(String[] args) {
		FinalizePractise f = new FinalizePractise();
//		calling finalize method explicitly
		f.finalize();
		f.finalize();
		f = null ;
//		requesting jvm to call garbage collector
		System.gc();
		System.out.println("Main completes");
	}
//	overriding finalize method
	public void finalize(){
		System.out.println("finalize method overriden");
	}
}
// if programmer calling finalize method explicitly ,the object won't get destroyed'
//Note: As finalize is a method and not a reserved keyword, so we can call finalize method Explicitly,
//then it will be executed just like normal method call,
//but object won’t be deleted/destroyed

//class RR {
//	public static void main(String[] args)
//	{
//		RR q = new RR();
//		q = null;
//
//		// Requesting JVM to call Garbage Collector method
//		System.gc();
//		System.out.println("Main Completes");
//	}
//
//	// Here overriding finalize method
//	public void finalize()
//	{
//		System.out.println("finalize method overridden");
//		System.out.println(10 / 0);
//	}
//}

//Output:
//exception in thread "main" java.lang.ArithmeticException:
/// by zero followed by stack trace.
//So the key point is: If the programmer calls finalize method while executing finalize method some unchecked exception rises,
//then JVM terminates the program abnormally by rising an exception.
//So in this case, the program termination is Abnormal.



//class RR {
//	public static void main(String[] args)
//	{
//		RR q = new RR();
//		q = null;
//
//		// Requesting JVM to call Garbage Collector method
//		System.gc();
//		System.out.println("Main Completes");
//	}
//
//	// Here overriding finalize method
//	public void finalize()
//	{
//		System.out.println("finalize method overridden");
//		System.out.println(10 / 0);
//	}
//}

// Output:
//Main Completes
//finalize method overridden
//So the key point is if Garbage Collector calls finalize method while executing finalize method some unchecked exception rises 
//then JVM ignores that exception and the rest of the program will be continued normally.
//So in this case the program termination is Normal and not abnormal.

