package infor.pkg.aug11;

import java.util.Scanner;

public class StringProb {

	public static void main(String[] args) {
		
		
	Scanner Iin = new Scanner(System.in);
	System.out.println("Enter the position of the character ?");
	int pos = Iin.nextInt();
		
		
		String str = "this the practice string used in the entire program.";
		System.out.println(str);
		
		//checking the length of the string
		int length = str.length();
		System.out.println(length);
		
		
//		returning the character at the index'
		char charAt = str.charAt(pos);
		System.out.println("character at the pos: " + pos + " is " + charAt);
		
//	using the substring method...
		String Substr = str.substring(2,5); // parameters passed beginidx and endIdx
		System.out.println("substring is : "+Substr);
	
		
//	using the startswith method...
	boolean chkStr = str.startsWith("this");
	System.out.println("checking whether my string statrs with `this` or not ? " +  chkStr);
	
//	using the indexOf...
//	used to match whether a specific occurence of a pattern is there in the string or not? it returns -1 if not found
	
	int idx = str.indexOf("ipe");
	System.out.println("index of `is` is : " +  idx);
	
//	using the concat method...
	String str2 = "     String addes via concat method";
	String CStr = str.concat(str2);
	System.out.println(CStr);
//		If the first string is lexicographically greater than the second string, it returns a 		positive number (difference of character value). If the first string is less than the 		second string lexicographically, it returns a negative number, and if the first 		string is lexicographically equal to the second string, it returns 0.
	
	System.out.println("returns what? " + str.compareTo(str2));
	
	
//	using the trim method...
//	used to trim the leading and trailing spaces if any...
	System.out.println(str2);
	str2.trim();
	System.out.println(str2);
		
	
		
		
		
		
		
	}// end of psvm

}// end of the class
