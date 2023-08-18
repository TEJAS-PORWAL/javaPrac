package infor.pkg.aug17;

public class LablledForLoops {
	public static void main(String [] args) {
		// Outer loop.	
		   outer: for(int i = 1; i < 3; i++)
		   { 
		      System.out.println("i: " +i);	 
		      // Inner loop. 
		      int j = 1;	 
		      while(j < 3)
		      {
		         System.out.println("j: " +j);	 
		         int x = i + j;	 
		         if(x > 2)
		        	 break outer;
		         j++;
		      }
		   }
		  System.out.println("Jumping out of both labelled loops");
	}
}
