package infor.pkg.aug10;

import java.util.Scanner;

interface beginWithCopy {
	int printDetails(int salary) ;
		//this is the interface implementnaiton
	
}


public class interfaceImplementation implements beginWithCopy {
	
	public int printDetails(int salary) {
		if(salary > 700000) {
			int tax = (int) (salary *.01);
			System.out.println("the income tax for this year would be " + tax);
			return tax;
		}
		else {
			System.out.println("No Income tax need to be paid!");
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Iin = new Scanner(System.in);
		
		System.out.println("please enter the salary for tax need to be calculated ? ");
		int salary = Iin.nextInt();
		
		interfaceImplementation IT = new interfaceImplementation();
		int tax = IT.printDetails(salary);
		
		System.out.println("the update salary is " + (salary-tax));
	}

}
