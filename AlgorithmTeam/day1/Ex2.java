package day1;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		//정렬 안 된 배열(중복수 없음)
		int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		List<Integer> list = new ArrayList<Integer>(arr.length);
		for(int tmp : arr) list.add(tmp);
		int max = Collections.max(list);
		
		System.out.println("max : "+max);
		System.out.println("index : "+list.indexOf(max));
	}

}
