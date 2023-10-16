package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> name = new HashSet<String>();
		name.add("sheetal");
		name.add("daksh");
		name.add("neeraj");
		name.add("dhruv");
		name.add(null);
		name.add("sheetal");
		
		for(String s : name) {
			System.out.println(s);
		}
		
		System.out.println();
		
		
		Set<String> name1 = new LinkedHashSet<String>();
		
		name1.add("sheetal1");
		name1.add("daksh1");
		name1.add("neeraj1");
		name1.add("dhruv1");
		name1.add(null);
		name1.add("sheetal1");
		name1.add(null);
		
		for(String a : name1) {
			System.out.println(a);
		}
		
		
		System.out.println();
		
		
		Set<String> name2 = new TreeSet<String>();
		
		name2.add("sheetal2");
		name2.add("daksh2");
		name2.add("neeraj2");
		name2.add("dhruv2");
//		name2.add(null);
//		Can't add null if creating new Tree set object.
		name2.add("sheetal2");
//		name2.add(null);
		
		for(String ab : name2) {
			System.out.println(ab);
		}
		
//		List<String> name3 = new Vector<String>();
		
		
		System.out.println();
		
		List<String> name3 = new ArrayList<String>();
		name3.add("sheetal3");
		name3.add("daksh3");
		name3.add("neeraj3");
		name3.add("dhruv3");
//		name3.add(null);
		name3.add("sheetal3");
//		name2.add(null);
		
		for(String ab : name3) {
			System.out.println(ab);
		}
		
		System.out.println();
		List<String> name4 = new Vector<String>();
		
		name4.add("sheetal4");
		name4.add("daksh4");
		name4.add("neeraj4");
		name4.add("dhruv4");
		name4.add(null);
		name4.add("sheetal4");
		name4.add(null);
		
		for(String ab : name4) {
			System.out.println(ab);
		}
		
		System.out.println();
		
		List<String> name5 = new LinkedList<String>();
		
		name5.add("sheetal5");
		name5.add("daksh5");
		name5.add("neeraj5");
		name5.add("dhruv5");
		name5.add(null);
		name5.add("sheetal5");
		name5.add(null);
		
		for(String ab : name5) {
			System.out.println(ab);
		}
		
		System.out.println();
		List<String> name6 = new Stack<String>();
		
		name6.add("sheetal6");
		name6.add("daksh6");
		name6.add("neeraj6");
		name6.add("dhruv6");
		name6.add(null);
		name6.add("sheetal6");
		name6.add(null);
		
		for(String ab : name6) {
			System.out.println(ab);
		}
		
	}

}
