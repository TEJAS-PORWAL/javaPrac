package infor.pkg.aug10;

import java.util.Scanner;

abstract class Peoples{
	String Name;
	int age;
	String profile;
	
	public void about(String Name, int age, String profile) {
		// this is an abstract method	
}
}

public class checkAbstraction extends Peoples{
	
	@Override
	public void about(String Name, int age, String profile) {
		System.out.println("Hi! I'm "+ Name + " I'm " +  age + " year old " + "working as a " + profile);
	}
	
	
	//MAIN METHOD
	public static void main(String[] args) {

		
	
		Scanner Sin = new Scanner(System.in);
		Scanner Iin = new Scanner(System.in);
		System.out.println("enter the number of records you want?");
		int entry = Iin.nextInt();
		Peoples Emp1 = new checkAbstraction();
		
		while(entry>0) {
			try {
				System.out.println("enter the name of the employee \t");
				String EmpName = Sin.nextLine();
				System.out.println("enter the age of the employee \t");
				int EmpAge = Iin.nextInt();
				System.out.println("enter the role of the employee \t");
				String EmpRole = Sin.nextLine();
				
				Emp1.about(EmpName, EmpAge, EmpRole);
				
				entry--;
				}
			catch (Exception e) {
				System.out.println(e);
				}	
			}
	}
}
