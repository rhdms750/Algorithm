package day1;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr = {6,2,1,3,4,5,6,6,0,3,4,5,2,1};
		int[] cnt = new int[7];
		
		for(int i = 0; i < arr.length; i++)
			cnt[arr[i]]++;
		
		System.out.println(Arrays.toString(cnt));
	}

}
