package infor.pkg.aug10;

import java.util.*;

class Salary{

	static int salary=60000;
	 public void setName(int salary){
	        this.salary = salary;
	    }

	    public static int getName(){return salary;}

}

class Benefits extends Salary{

	int benefits= 5000;

	

}

public class newCheck extends Benefits {

 

	public static void main(String[] args) {

		Benefits b1=new Benefits();
		

		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter your base location");

//		String location="blr";
		String location;
		location=sc.nextLine();

		if(location.equals("blr")) {

			System.out.println("The total payable salary is "+(Salary.salary+b1.benefits));
			System.out.println(location);

		}

		else {

			System.out.println("The total payable salary is"+Salary.salary);
			System.out.println(location);

		}

	}

}