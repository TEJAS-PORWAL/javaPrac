package infor.pkg.aug16;
//String also in pkg.aug11
public class StringProb2 {

	public static void main(String[] args) {
		String s1 = "infor";
//		s1.concat("Global");  //	-- this won't change the orignal string `s1`...
		s1 = s1.concat("Global");
		System.out.println(s1);
		
		System.out.println("using the substring " + s1.substring(1,4));
		
		//using the replace method in strings...
		s1=s1.replace('o', 'k');
//		s1.replace('o', 'k'); //now if u execute this statement the orignal string is not affected because we didn't assign it to new reference...
		System.out.println(s1);
			
//		using the toLower and toUpper case methods...
		String s2 =s1.toLowerCase();
//		s1.toLowerCase();
		System.out.println(s2);
		
		s2 =s1.toUpperCase();
		System.out.println(s2);
	
	}// end of psvm

}//end of class
