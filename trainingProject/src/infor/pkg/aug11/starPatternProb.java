package infor.pkg.aug11;

import java.util.Scanner;

public class starPatternProb {
public static void main(String[] args) {
	
	// print the star patterns problems...
	Scanner Iin = new Scanner(System.in);
	
	System.out.println("enter the number of rows you want?");
	int Rows = Iin.nextInt();
	System.out.println("Enter the number of Columns ?");
	int Columns = Iin.nextInt();

/*	
	for(int rc = 1; rc <= Rows; rc++) {
		for(int cc = 1; cc <= Columns; cc++) {
			if(cc<=rc) {				
			System.out.print("*");
			}
		}
		System.out.print("\n");
	}
*/
	
	
//	trying the same pattern with the single loop...
/*
	for (int rc=1; rc<=Rows; rc++) {
		int cc=1;
		while(cc<=rc) {
			System.out.print("*");
			cc++;
		}
		System.out.print("\n");
	}
*/
	
	int colcnt=0;
	int rc=1;
//	only using one for loop...
	for(rc=1; rc<=Rows;) {
		
		if(colcnt<rc) {
			System.out.print("*");
			colcnt++;
			continue;
		}
	    if (colcnt>=rc) {
			System.out.println();
			
				}
	    rc++;
		colcnt=0;
	}
	
	
	
	
	}	//end of psvm...
}	// end of class...
