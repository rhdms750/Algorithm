package _00_문법;

import java.util.Arrays;

public class _00_LinearSearch {

	public static void main(String[] args) {
		int[] arr = new int[10];
		init(arr);
		System.out.println(Arrays.toString(arr));
		
		//linear search
		//전제 : 정렬되지 않은 데이터
		//찾으려는 수 : 5
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==5) {
				System.out.println("index : "+i);
				break;
			}
		}
	}
	
	public static void init(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*arr.length)+1;
			for (int j = 0; j < i; j++) {
				if (arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
	}
}
