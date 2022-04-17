package day1;

import java.util.*;

public class Ex6 {

	public static void main(String[] args) throws Exception{
		Set set = new TreeSet();
		
		for(int k = 0; set.size() < 6; k++) {
			int num = (int)Math.random()*45+1;
			System.out.println(num);
			set.add(num);
		}
		System.out.println(set);
	}

}
