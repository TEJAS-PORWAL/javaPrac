package infor.pkg.aug18;

public class HashCode {

	public static void main(String[] args) {
		String a = "100";
	    float b = 100;
	      int cc =1000;
	      System.out.println("jewish" + Integer.hashCode(cc));
	    // Printing the hashcodes of a and b
	    System.out.println("HashCode of a = " + a + ": " + a.hashCode());
	    System.out.println("HashCode of b = " + b + ": " + Float.hashCode(b));
	    
	    // Declaring a different variable
	    String c = "500";

	    // Printing the hashcode of c
	    System.out.println("HashCode of c = " + c + ": " + c.hashCode());
	    
	    // Second Computation of a's hashcode
	    System.out.println("HashCode of a = " + a + ": " + a.hashCode());

	}

}
