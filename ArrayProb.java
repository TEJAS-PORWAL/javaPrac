package infor.pkg.aug14;

import java.util.Scanner;


 
public class ArrayProb {

	public static void main(String[] args) {
		Scanner Iin = new Scanner(System.in);
		
		int[] inArr = {1,11,2,21,3,31,4};
		char[] chArr = {'a','b','c','d'};
		String[] StArr = {"tejas","swathi", "prem"};
		for(int i=0; i<inArr.length; i++) {
		System.out.println("integer array is " + inArr[i]);
		}
		
		for(int i=0; i<chArr.length; i++) {
			System.out.println("char array is " + chArr[i]);
		}
		for(int i=0; i<StArr.length; i++) {
			System.out.println("string array is " + StArr[i] );
		}		
//		`length` method is  use to return the length of the given array...
		
/*
		System.out.println("size of integer array is "+ inArr.length);
		
	System.out.println("size of char Arr is " + chArr.length);
	
	System.out.println("size of string array is " + StArr.length);	

*/
	
		
		
//		iterating the string array using the for loop and for each loop
		
		/*
		 * 
 for (int itr=0; itr<StArr.length; itr++) {
	 System.out.println(StArr[itr]);
 }
// using the forEach approach...
 for (String StrIt : StArr){
	 System.out.println(StrIt);
 }
 
 */
		
//using array index for finding the element and using it in the different ways...
		/*
		System.out.println("enter the index if you want to search the element for ?");
		int index = Iin.nextInt();
		if(index<=StArr.length) {
			System.out.println("element @ index: " + index + " is " +StArr[index] );
			
		}
		else
		{
			System.out.println("element not found please enter a valid index");
		}
	*/
		
//finding the max value from a integer Array...
		/*
		int tempMax = inArr[0];
		for (int i=0; i<inArr.length; i++) 		{	if(tempMax<inArr[i]) {
				tempMax = inArr[i];
		}
		
	}
		System.out.println("the max element in the array is " + tempMax);
	*/
//finding the min value from a integer Array...
		/*
		int tempMin = inArr[0];
		for (int i=0; i<inArr.length; i++) 		{	if(tempMin>inArr[i]) {
				tempMin = inArr[i];
		}
		
	}
		System.out.println("the max element in the array is " + tempMin);
*/
		
		
	}//end of psvm
}//end of class
