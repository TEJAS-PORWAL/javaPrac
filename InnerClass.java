package infor.pkg.aug10;

public class InnerClass {
	
	
	
	class Inner{
		void PrintMsg() {
			System.out.println("this is the inner class PrintMsg method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		InnerClass IC = new InnerClass ();
		InnerClass.Inner in = IC.new Inner();
		in.PrintMsg();
	}

}
