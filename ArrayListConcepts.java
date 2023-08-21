package infor.pkg.aug18;

import java.util.*;


public class ArrayListConcepts {

	public static void main(String[] args) {
		System.out.println("this is a ArrayList of Integer");
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(13);
		AL.add(2133);
		AL.add(123);
		AL.add(132);
		AL.add(124);
		AL.add(114);
		AL.add(1343);
		
		Iterator<Integer> it = AL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\n this is a ArrayList of string");
		ArrayList<String> ALs = new ArrayList<String>();
		ALs.add("tejas");
		ALs.add("coding");
		ALs.add("new");
		ALs.add("check");
		ALs.add("listen");
		ALs.add("loud");
		ALs.add("af");
		
		Iterator<String> it2 = ALs.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	} // end of psvm
}// end of class
