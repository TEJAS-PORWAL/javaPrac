package infor.pkg.aug21;
import java.lang.*;

public class ExceptionHandling {
	
	public static int checkInput(int num1, int num2 ) throws ArithmeticException
	{
		int output = num1/num2;
		return output;
		
	}
	
	public static void divideFunc(int num1, int num2) {
		if(num2==0)
		throw new ArithmeticException("cannot divide by the current denominator");
		else
			System.out.println(num1/num2);
	}

	public static void main(String[] args) {
		int[] arr = new int[6];
		try {
			System.out.println(arr[13]);
		}
		catch(ArrayIndexOutOfBoundsException e){ 
			System.out.println("no such element found" + e.getMessage());
		}
	//2nd Exception...	
		try {
			System.out.println("quotient obtained is  "+checkInput(12,0));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("changing the denominator in such case and now dividing by 2 hence output is " + checkInput(12,2));
		}
		finally {
			System.out.println("this is finally-block us me for the printing your final message...");
		}
		divideFunc(12,0); 
		
		
		//3rd example using the throw keyword...
		try {
			divideFunc(12,0); // if you try to call the divideFunc() method without the try-catch block it will not execute the remaining of the statememts... ie call the function with throw key using the try-catch block to avoi
		} catch (Exception e) {
			e.printStackTrace();;
		}
		
	
		
	System.out.println("now you are out of try-catch block...");
		
	}// end of psvm

}//end of class