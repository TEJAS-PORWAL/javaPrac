package infor.pkg.aug11;

public class OperatorsInJava {

	public static void main(String[] args) {
		
//		--STRING TPYE CHECK --
	/*	
		String s1 = "HELLO";
		String s2 = "HELLO";
		String s3 = new String("HELLO");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
	*/	
		
		
//		-- INCREMENT AND DECREMENT OPERATORS
	/*	int val1 = 10;
		int val2 = 12;
		
		val1= val1++;
		val2++;
		System.out.println(val1);
		System.out.println(val2);
		
		++val1;
		++val2;
		System.out.println(val1);
		System.out.println(val2);
		*/
		
		/*-- DATATYPES IN JAVA --
		
		int newVal = 5;
		float FNum =  4.905f;
		char bytechar = 'b';
		boolean boolVal = false;
		String StrngVal = "new string";
		long number = 6387225013l;
		
		System.out.println(newVal);
		System.out.println(FNum);
		System.out.println(bytechar);
		System.out.println(boolVal);
		System.out.println(StrngVal);
		System.out.println(number);
		
		*/
		
		
//		-- java STRINGS --
/*		
 * String TextVal = "You always can";
		
		int lenghtOfString = TextVal.length();
		System.out.println(lenghtOfString);
		
		char valAt = TextVal.charAt(5);
		System.out.println(valAt);
		
		int Idx = TextVal.indexOf("a");
		System.out.println(Idx);
		
		boolean chkStr = TextVal.startsWith("You");
		System.out.println(chkStr);
	*/	
		
		
//-- loop in java examples --
		/* 
		  int time = 22;
		 
		if(time > 10)
			System.out.println("t1");
		else if (time < 10)
			System.out.println("t2");
		else 
			System.out.println("t3");
		*/
	
		
//		-- example of for loop --
	/*
		 for (int OL = 1; OL <=2; OL++ )
		 
		{
			System.out.println("outer : " + OL );
			for(int IL = OL; IL<=3 ; IL++) {
				System.out.println("INNER : "+IL);
			}
				System.out.println("\n");
		}
	*/
	
				
//	--	do while loop examples --
	/*
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<5);
	*/
		
//		-- working with the switch statement--
	/*	
		int dayCode = 4;
		switch (dayCode) {
		case 0: 
			System.out.println("monday");
			break;
		case 1: 
			System.out.println("tuesday");
			break;
		case 2: 
			System.out.println("wedenesday");
			break;
		case 3: 
			System.out.println("thursday");
			break;
		case 4: 
			System.out.println("friday");
			break;
		case 5: 
			System.out.println("saturday");
			break;
		case 6: 
			System.out.println("sunday");
			break;
		default :    // if no default the the switch statement returns nothing
			System.out.println("let's see");
		}
	*/
		
//	-- arrays --
	/*
		int arr[]= {11,111,1111,11221};
		int [] arr2 = new int[] {1,12,3,12};
	*/
		
//		largest element in the array
	/*	
		int[] sampleArr = new int[] {25,26,265,23,2};
		int TempMax = sampleArr[0];
		
		for(int i=0; i<sampleArr.length; i++) {
			if(TempMax<sampleArr[i]) {
				TempMax = sampleArr[i];
			}
		}
		System.out.println(TempMax);
		*/
//		-- 2nd example --
	/*	double [] arr = new double[10];
		arr[4]=10;
		System.out.println(arr[4]);
		System.out.println(arr[5]);
	*/	
		
//	MORE EXAMPLES ON ARRAY
		
		
		
		
		
		
		
	} //end of PSVM
}//end of CLASS LOOP
