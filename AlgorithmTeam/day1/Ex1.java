package day1;

public class Ex1 {

	public static void main(String[] args) {
		//정렬 안 된 배열(중복수 없음)
		int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		//linear search
		int max = arr[0];
		int index = 0;
		for(int i = 1; i < arr.length; i++) {
			max = max<arr[i]? arr[i] : max;
			index = i;
		}
		System.out.println("max : "+max);
		System.out.println("index : "+index);
	}

}
