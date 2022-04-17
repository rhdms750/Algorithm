package day1;

import java.util.*;

public class Ex8 {

	public static void main(String[] args) throws Exception{
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); 
		set.add("bat"); set.add("Car"); set.add("disc");
		set.add("everybody"); set.add("emilie");
		set.add("friedchicken"); set.add("goosebump");
		set.add("heath"); set.add("cook"); set.add("Bootcamp");
		
		System.out.println(set);
		
		TreeSet set2 = new TreeSet(new Descending());
		set2.addAll(set);
		System.out.println(set2);
		
		System.out.println("set.subSet(from, to)"+set.subSet(from, to));
		System.out.println("set.subSet(from, to)"+set.subSet(from, to+"oosebump"));
		System.out.println("set.subSet(from, to)"+set.subSet("Car", to+"oosebump"));
	}
	
	static class Descending implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Comparable && o2 instanceof Comparable) {
				Comparable c1 = (Comparable)o1;
				Comparable c2 = (Comparable)o2;
				return c1.compareTo(o2)*-1;
			}
			return -1;
		}
		
	}

}
