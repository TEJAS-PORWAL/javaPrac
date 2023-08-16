package infor.pkg.aug16;

public class typeConversion {

	public static void main(String[] args) {
//		We can convert int to String in java using String.valueOf() and Integer.toString() methods. Alternatively, we can use String.format() method, string concatenation operator etc.
//		converting number to string by using `toString` method
		int num = 13;
		String StN = Integer.toString(num);
		System.out.println("this " +StN +" is of type String ");
		
//		we can use other wrapper class such as float, double to change into String also...
		float numF = 13f;
		 StN = Float.toString(numF);
		System.out.println("this " +StN +" is of type String ");
		
//		converting String to Int datatype...
		String s1 = "10";
		int NfS = Integer.parseInt(s1);
		System.out.println("this " + NfS + " is converted to int datatype from String datatype");

	}

}
